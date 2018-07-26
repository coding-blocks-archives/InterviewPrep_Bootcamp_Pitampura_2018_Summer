## Directories - 

`.` = means current directory

`..` = means one directory up

`/` = means root directory (outermost directory in unix) 


## Paths

### Relative Paths

`./a` (file or folder a inside current directory) 

`../a` (sibling directory or file - that is inside my parent)

### Absolute Paths

`/a/b` will always start with `/`

### Alias-ed paths

`~/a` = means `/home/<username>/a` where username is of current user


### Find out path

`pwd` (stands for personal working directory) - shows current path of terminal




### 1. `cd` 

  change directory
  
  `cd ..`
  
  go up one directory
  
  `cd .`
  
  stays in same place
  
### 2. `mkdir`

    `mkdir abcd` creates directory abcd inside current folder
    
    `mkdir ab/cd` creates dir cd inside ab (fails if ab doesn't exist) 
    
    `mkdir -p ab/cd` creates ab if required and then creates cd inside it 
