
## GREP

### `grep`

  searches of text inside given files, or in a stream
  
  
#### `grep 'string' <files or folders>` 

    search 'string' inside given files or folders

#### `grep 'string' < stdin`

    search 'string' in provided input stream
    
#### `command | grep 'string'`

    search for 'string' in the output of command
    
## FIND

### `find` 
    find all files and folders
    
    `find . -type d` find all folders inside this folder (recursively)
    
    `find . -type f` find all files inside this folder (recursively)
