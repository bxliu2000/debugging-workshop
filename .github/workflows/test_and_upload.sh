#!/bin/bash

mvn test -B --file pom.xml \
    | grep "Tests run" -B 1 \
    | cut -d ' ' -f 2-14 \
    | sed '/^--/d' \
    | sed 's/^\s*$/Total/' \
    | sed 's/Running //g' 

output=$(mvn test -B --file pom.xml \
    | grep "Tests run" -B 1 \
    | cut -d ' ' -f 2-14 \
    | sed '/^--/d' \
    | sed 's/^\s*$/Total/' \
    | sed 's/Running //g' \
    | jq -RMsc 'split(" s\n") 
                | map({ (split("\n")[0]): split("\n")[1] })
                | .[] 
                |= map_values(
                    reduce split(", ")[] as $item (
                        {};
                        .[($item | split(": ")[0])] = ($item | split(": ")[1])
                    )
                )'
        )

echo "::set-output name=results::$output"
