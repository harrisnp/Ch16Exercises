`#Git

## One Time Setup

`$ git config --global user.name "Nathan Harris"`

`$ git config --global user.email "harrisnp@s.dcsdk12.org"`

## Project Setup
`git init`
`touch .gitignore`
Add `*.class` to the .gitignore files and save it.
`git add .`
`git commit -m "Initial commit"`

## 3 Step Repeating Commit Process
1. Make Changes to code
2. Stage related changes
    * git add
3. Commit changes with a message
    *git commit -m "Message"

## Commands

* status -> tell me what files have been staged or committed
* add -> add a file to the stage
* rm -- cached -> remove file from stage
* git commit -m "Present tense desctription of what changed"
* git log -> enter to move down, q to quit
* commit without -m -> Use Esc :wq  (then press enter) to quit Vim 
* Wrong message -> Git commit --amend -m "New Message"
* git checkout -- filename discard changes
* wrong commit -> git checkout COMMIT_ID
* git clone "url from github.com" -> clone files from school computer to home computer