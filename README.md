# Terminal Commands

- pwd: print working director
- mkdir: make directoty
- ls: list source
- cd: change directory
- mkdir -p
- javac MyFirstApp.java
- java myapp.core.MyFirstApp.java
- javac -d classes

## To set the classpath
- export CLASSPATH="./classes"

## How to compile
javac -d classes myapp/core/Greetings.java
java myapp.core.Greetings

Note: Everytime you make a new change, you need to compile it before running it

## How to use Git
1. cd into root repository 
2. git init - initialise a new repository [ONLY DO THIS ONCE]
3. git add . - File goes from working directory to staging area (. means add everything in the directory)
4. git commit -m "write a message" - File goes from staging area to local repo 
5. git push -u origin main/master - make a copy of the file from the local repo to the remote repo (Commit the file to make changes permanent. May have multiple versions)


### Other commands
- git log - Lists all of the commits
- git branch - See all of the branches of git you currently have (Default: Main/Master)
- git remote -v - See the remote repository 

## Create Git Repo & Connect 
1. Go to Github and create a new public repository
2. remote add origin <name of SSH>

### To generate ssh
ssh-keygen -t rsa -b 4096 -C <email> -f mykey


**NOTES:**
- Class files should not be committed as people can compile it from the java
- To commit the files, it needs to be in the staging area first


# Java Data Types
- 1 byte = 8 bits (8 digits)
- 4 bits = 1 hex

## Primitive Types
- boolean
- char
- byte(8), short(16), int(32), long(64)
- float(32), double(64)
- string

## Calculator Solution (Instructor)

Integer val0 = Integer.parseInt(opnd0);
Integer val1 = Integer.parseInt(opnd1);
Float result = 0f; 

switch (operator) {
    case "add":
        result = (float)(val0 + val1); //? This is known as casting or coercion where we force one type into another
        break;
    case "sub":
        result = (float)(val0 - val1);
        break;
    case "mul":
        result = (float)(val0 * val1);
        break;
    case "div":
        result = ((float)val0 / val1;
        break;

    default:
}
System.out.printf("Result: %d %s %d = %f", val0, operator, val1, result);
