# Steps for adding the JUnit library to this project

- File (top-level menu) > Project Structure
- Project Settings > Libraries > + (plus) button > From Maven
  ![Lib Popup](doc/popup0.png)
- Popup Download Library from Maven Repository 
  ![DL Popup](doc/popup1.png)
  - enter `junit:junit:4.13`
  - make sure Transitive dependencies is checked
  - leave everything else unchecked
  - OK
- Popup Library will be added > OK 
  ![Add Popup](doc/popup2.png)