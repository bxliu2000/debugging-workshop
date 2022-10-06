# CSM 61B Debugging Workshop

This codebase contains all of the (faulty) functions and corresponding test cases for the CSM debugging workshop. 

## Instructions for Contestants

### Cloning & branch `fa22/*`

For the following instructions, please replace `<username>` with your github username, e.g. `bxliu2000`.
```
git clone https://github.com/bxliu2000/debugging-workshop.git       # Clones the repo.
git checkout -b fa22/<username>                                     # Checks out a branch.
```
### Debugging & Running Tests

Open up the repo in IntelliJ. (TBD someone please help me with specific intellij configurations to make this work!)

### Submitting

**Important**: Only work done on your branch is going to be graded! This command will help push your newly created branch onto the remote repo.
```
# Sanity check: fa22/<username> should be your branch name!

git push -u origin fa22/<username>    
```
Changes pushed to your remote branch will be automatically submitted in the competition!
```
git add src/main/java/com/csmentors/app
git commit -m <commit message>
git push
```
If all works, you can see your commit trigger a workflow on [actions](https://github.com/bxliu2000/debugging-workshop/actions).
Once the workflow finishes, the leaderboard should be automatically updated :)

## Instructions for Contributors

### Cloning & branch

```
git clone https://github.com/bxliu2000/debugging-workshop.git
git checkout -b qa/<username>
```

### Adding Questions

Functions and their corresponding test cases are independent and self-encapsulated. Look into the contents of the file in order to copy format!
```
src
├── main
│   └── java
│       └── com
│           └── csmentors
│               └── app
│                   ├── App.java
│                   ├── LongestCommonPrefix.java
│                   ├── LongestPalindromicSubstring.java
│                   └── TwoSum.java
└── test
    └── java
        └── com
            └── csmentors
                └── app
                    ├── AppTest.java
                    ├── LongestCommonPrefixTest.java
                    ├── LongestPalindromicSubstringTest.java
                    └── TwoSumTest.java
```
Tests are run in the backend using [Maven](https://maven.apache.org/install.html). I don't think you have to download or use maven because it's ultimately just running junit in the background - meaning if it works in IntelliJ it *should* just work? But to be safe:
```
mvn test
```
I didn't qa with various java versions we can add that as a TODO later. 

### Create a pull request
Push your changes via
```
git push -u origin qa/<username>
```
And raise a pull request on github or ping me on slack to have me review!
