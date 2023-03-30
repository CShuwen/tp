---
layout: page
title: CareFlow User Guide
---
<a id="top"></a>

* Table of Contents
{:toc}

--------------------------------------------------------------------------------------------------------------------

# **1. Introduction**

Welcome to CareFlow, your all-in-one solution for managing patient information and drug inventory in the General Practitioner clinic. Do you find yourself struggling to keep track of patient details? Are you tired of manually managing your drug inventory? CareFlow is here to help! Our easy-to-use desktop application is specifically designed for receptionists who want to improve their workflow and provide better patient care.

CareFlow is a **desktop application for patient and drug inventory management, optimised for use via a Command Line Interface** (CLI) while benefiting from a Graphical User Interface (GUI). With CareFlow, you can streamline your workflow, improve patient care, and reduce the stress of managing multiple systems and spreadsheets. If you are a receptionist at a GP clinic and are comfortable typing, CareFlow can streamline your daily patient and drug management tasks, saving you from tedious daily routines and allowing you to focus on what really matters —— your patients' well-being! Interested? Jump to Section [3. Quick Start](#3-quick-start) to get started. Enjoy!

<p align="center">
  <img src="images/Ui.png" style="zoom:100%"/>
</p>
<p align="center">
Figure 1. Graphical User Interface (GUI) of CareFlow*
</p>

[↑ Back to top](#top)

<br>


--------------------------------------------------------------------------------------------------------------------

# **2. About**

Welcome to the CareFlow user guide! This guide is designed to help you make the most of the software by providing detailed instructions on its features and functionalities.

## 2.1 How to navigate this user guide

To help you navigate the guide, we've divided it into several sections, each covering a different aspect of CareFlow. Here's a brief overview of what you'll find in each section:

1. Section [1. Introduction](#1-introduction)
    - If you want to know what CareFlow is all about, head over to section 1, "Introduction". In this section, you'll learn about CareFlow's goals and purpose, as well as get an overview of what the system can do for you.

2. Section [2. About](#2-about)
    - if you want to learn more about the guide itself and how to use it, refer to section 2, "About". Here, you'll find useful information on the symbols used in this user guide and how to navigate it easily.

3. Section [3. Quick Start](#3-quick-start)
    - If you're new to CareFlow and need help getting started, head to Section 3, "Quick Start", where you'll find step-by-step instructions to set up and begin using the application.

4. Section [4. Features](#4-features)
    - If you're looking for information on specific features, check out Section 4, "Features". Here you'll find a detailed explanation of each feature and how to use it.

5. Section [5. FAQ](#5-faq)
    - If you have any questions about using CareFlow or running into any issues, take a look at Section 5, "FAQ". We've included answers to common questions and troubleshooting tips to help you out.

6. Section [6. Command Summary](#6-command-summary)
    - If you want a quick reference for all the commands available in CareFlow, head to Section 6, "Command Summary". This section provides a list of all the commands and their functions, making it easy to find what you need.

To make the most of this user guide, we recommend reading through it in order, starting with the Introduction and working your way through each section. You can also use the table of contents to jump to specific sections as needed.

## 2.2 Note on symbols and formatting used

Throughout this user guide, you may come across different formatting styles and symbols. These are used to make the guide more readable and easier to understand. Here are some of the formatting styles and symbols you may encounter:

| **Symbol/ Format**   | **Meaning**                                                                                                                                                                                                                                                                                               |
|----------------------|-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| :exclamation:        | This symbol is used to indicate important warning information that you should be mindful of when using CareFlow.                                                                                                                                                                                          |
| UPPER_CASE           | Words in UPPER CASE are the parameters that you need to supply to the system. E.g. in `add -n NAME`, `NAME` is a parameter which you specify the name of the patient that you wish to add. For instance, a possible value for the NAME parameter is John Doe, and the command would be `add -n John Doe`. |
| [brackets]           | Items in square brackets are optional. E.g. update -n NAME [-ph PHONE] can be used as `update -n Alice` or `update -n Alice -ph 12345678`                                                                                                                                                                 |
| `command`            | The grey highlighting indicates that the word is a command to be entered by the user.                                                                                                                                                                                                                     |
| [2. About](#2-about) | Blue texts shown are clickable links. These links will take you to specific sections of this User Guide or external website.                                                                                                                                                                              |

<p align="center"> 
Table 1. Symbols and formats used in this User Guide.
</p>

<br>

[↑ Back to top](#top)

<br>

--------------------------------------------------------------------------------------------------------------------
 <p align="center">
      </p>
# **3. Quick start**

1. Ensure you have Java 11 installed in your Computer.
   <details>
   <summary>Click here for more information on Java 11 installation</summary>
      <details>
      <summary> I. Installing Java 11 on Windows: </summary>
   <ul>
   <li>
   To install Java 11 on Window, you have to first <span style="color:orange">download the jdk installer</span> and then <span style="color:orange">run the jdk installer</span> to install Java 11.
   </li>
   
    <br>
   <li>
   Step 1: To download jdk installer, click on the <a href="https://docs.oracle.com/en/java/javase/11/install/installation-jdk-microsoft-windows-platforms.html#GUID-371F38CC-248F-49EC-BB9C-C37FC89E52A0">link</a> and scroll down to <code>Downloading the JDK installer</code> section:
     <p align="center">
      <img src="images/UGscreenshots/jdk_installer_windows.png" style="zoom:25%">
       </p>
    </li>
   
   <br>
   <li>
   Step 2: Click on the <code>Java SE Downloads</code> link, which leads you to this page:
     <p align="center">
        <img src="images/UGscreenshots/installer_oracle_home.png" style="zoom:15%">
       </p>
   </li>
         
   <br>
   <li>
   Step 3: Scroll down to this section, then, click on the <code>Java 11</code> tab in the top left corner:
     <p align="center">
       <img src="images/UGscreenshots/java11_installer_oracle.png" style="zoom:15%">
     </p>
   </li>
     
   <br>
   <li>
    Step 4: Click on the download linked circled out in the following picture. Note that you will be promoted to register an Oracle account. After registration, the download will start automatically.
      <p align="center">
      <img src="images/UGscreenshots/java11_installer_oracle_annotated.jpg" style="zoom:16.1%">
      </p>
      <p align="center">
      <img src="images/UGscreenshots/oracle_resgister.png" style="zoom:15%">
      </p>
   </li>
   
      <br>
   <li>
   Step 5: Locate the downloaded file and double-click the icon to <code>run the jdk installer</code>. Then, simply follow the instructions provided by the installer.
     <p align="center">
       <img src="images/UGscreenshots/jdk_downloaded.png" style="zoom:40%">
     </p>
   </li>
   
     <br> 
   </ul>
     </details>

     <details> 
     <summary>II. Installing Java 11 on macOS</summary>
   <ul>
   <li>
     Click on the <a href="https://docs.oracle.com/en/java/javase/11/install/installation-jdk-macos.html">link</a> and scroll down to <code>Installing JDK on macOS</code> and simply follow the instructions there!
       <p align="center">
       <img src="images/UGscreenshots/jdk_macOS.png" style="zoom:25%">
       </p>
   </li>
   
   <br>
   </ul>
       </details>
       </details>

2. Download the latest `careflow.jar` jar file from <a href="https://github.com/AY2223S2-CS2103T-W09-3/tp">here</a>.

3. Copy the jar file to the folder you want to use as the home folder for your careflowBook. For instance, you can create a folder `CareFlow` on your desktop and put the jar file inside.

4. Open a `command terminal`
   <details>
   <summary>Click here for more information on Java 11 installation</summary>
      <details> 
      <summary> I. For macOS: </summary>
   <ul>
   <li>
    Step 1: Click on the <code>spotlight search</code> icon in the top right corner of your navigation bar, you'll see a search bar popping out.
        <p align="center">
          <img src="images/UGscreenshots/spotlight_search.png" style="zoom:10%">
        </p>
   </li>
        <br>
   <li>
    Step 2: Type <code>terminal.app</code> into the search bar, and simply hit <code>Enter</code>
        <p align="center">
             <img src="images/UGscreenshots/terminal.png" style="zoom:25%">
        </p>
   </li>
        <br>
   <li>
    Step 3: You're now looking at the <code>command terminal</code>, good job!
        <p align="center">
            <img src="images/UGscreenshots/command_terminal.jpg" style="zoom:29.5%">
        </p>
   </li>
        <br>

   </ul>
            </details>
      <details> 
      <summary> II. For Windows:</summary>
   <ul>
   <li>
          To Be Added
   </li>
   </ul>
         </details>
         </details>

5. The next step is to navigate into the folder you put the jar file in with the `cd` command
   <details>
   <summary> Click here for more information on navigating to jar file </summary>
    <ul>
   <li>
    Suppose you have adopted the suggestion to put the jar file inside a folder called <code>CareFlow</code> on your desktop, you should type:<code>cd desktop/CareFlow</code> into your <code>command terminal</code> and hit <code>Enter</code>. <br>
   </li>

   <br>
   <li>
    For keen learners, you can take a look at the short video below to fund out more about the <code>cd</code> command
         - For macOS: <a href="https://www.youtube.com/watch?v=VJZ9mk6D6pw">Change Directories in MacOS Terminal (cd command)</a>
         - For Windows: <a href="https://www.youtube.com/watch?v=Q3XQpnQTy6Y">How to Use CD Command in CMD</a>
   </li>
   </ul>
   
   </details>
6. Type the `java -jar careflow.jar` command into your `command terminal` and hit `Enter` to run the application. A GUI similar to the below should appear in a few seconds. Note that the app contains some sample data.
  <p align="center">
    <img src="images/UGscreenshots/careflow_home.png" style="zoom:100%">
  </p>   

7. You can now start typing some command into the command box at the bottom and hit `Enter` to execute it. e.g. type in **`help`** and hit `Enter` will open the help window.<br>
   <details> 
   <summary>Click here for  Some example commands you can try</summary>
    <ul>
        <li><code>p list </code> : Lists all patients. </li> 
        <li><code>d list</code> : Lists all drugs.</li>
        <li><code>add -n John Lo -ph 98765431 -em johnl@example.com -ad John Street, Block 321, #02-02 -dob 22-02-2000 -g male -ic T3871910C</code> : Adds a patient named <code>John Lo</code> to the patient records.</li>
        <li><code>p delete 3</code> : Deletes the 3rd patient record shown in the current list.</li>
        <li><code>p clear</code> : Deletes all patient records.</li>
        <li><code>d clear</code> : Deletes all drug records.</li>
        <li><code>exit</code> : Exits the app.</li>
   </ul>
      </details>
    <br>

[↑ Back to top](#top)

<br>


--------------------------------------------------------------------------------------------------------------------
# **4. Features**

## 4.1 General Operations
### View help : `g help`
* Shows all valid command formats and their functionalities.
  <p align="left">
    <img src="images/UIscreenshots/helpMessage.png" style="zoom:100%">
  </p>
  <br>
* **Format:** `g help`

<br>

[↑ Back to top](#top)

<br>

### Exit the program : `g exit`
* You can exit the program with this command, your data will be automatically saved to the hard disk.
  \
  &nbsp;
* **Format:** `g exit`

<br>

[↑ Back to top](#top)

<br>

___

## 4.2 Patient Operations
### Add a Patient record:  `p add`
* You can use this command to add a new patient to the patient record, if it is the first time that this patient visit your clinic.
  \
  &nbsp;
* **Format:** `p add -n PATIENT_NAME -ph PHONE_NUMBER -em EMAIL -ad ADDRESS -dob DATE_OF_BIRTH -g GENDER -ic NRIC [-da DRUG_ALLERGY] [-ec EMERGENCY_CONTACT_NUMBER]`
  \
  &nbsp;
* **Example:** `p add -n John Doe -ph 91234567 -em johndoe@example.com -ad John Street, Block 123, #01-01 -dob 09-09-2000 -g male -ic S9284729C -da Xanax -ec 81234567`
    * Type the command into the command box and hit `Enter`
      <p align="center">
        <img src="images/UIscreenshots/patientSS/patientAdd.png" style="zoom:100%">
      </p>
      <br>
      
    * A message response will be printed on the screen, informing you that your command has been successfully executed!
      <p align="center">
        <img src="images/UIscreenshots/patientSS/patientAddresult.png" style="zoom:100%">
      </p>
      <br>    

    * John Doe is now added to the patient record. Click on John Doe and you will see his information being displayed at the right side.
      <p align="center">
        <img src="images/UIscreenshots/patientSS/../johnDoe_added.png" style="zoom:100%">
      </p>
      <br>    


[↑ Back to top](#top)

<br>

### Delete a Patient record by NRIC: `p delete`
* Deletes the specified patient from the patient list.
  \
  &nbsp;
* **Format:** `p delete -ic PATIENT_NRIC`
  \
  &nbsp;
* **Example:** `p delete -ic S9284729C`
    * Type the command into the command box and hit `Enter`
        <p align="center">
              <img src="images/UIscreenshots/patientSS/pdeleteic.png" style="zoom:100%">
        </p>
        <br>

    * Patient to be deleted:
        <p align="left">
      <img src="images/UIscreenshots/patientSS/pIC.png" style="zoom:25%">
        </p>
        <br>

    * A message response will be printed on the screen, informing you that your command has been successfully executed!
        <p align="center">
        <img src="images/UIscreenshots/patientSS/pdeleteICres.png" style="zoom:100%">
        </p>
        <br>

    * You can scroll through the list of patient, and John Doe should not be present.

<br>

[↑ Back to top](#top)

<br>

### Delete a Patient record by index: `p delete`
* You can also delete a patient by specifying the patient's index in the patient list you are currently looking at.
    * The index refers to the index number shown in the displayed person list.
    * The index must be a positive integer 1, 2, 3, …​
      \
      &nbsp;
* **Format:** `p delete -i PATIENT_INDEX`
  \
  &nbsp;
* **Example:** `p delete -i 8`
    * Then, scroll through the displayed list of patient record, and identify the index of the patient you wish to delete. Suppose we want to delete the 8th patient in the list, John Doe.
      <p align="center">
            <img src="images/UIscreenshots/patientSS/8p.png" style="zoom:100%">
      </p>
      <p align="center">
            <img src="images/UIscreenshots/patientSS/pdelete.png" style="zoom:100%">
      </p>
      <br>
    * A message response will be printed on the screen, informing you that your command has been successfully executed!
        <p align="center">
             <img src="images/UIscreenshots/patientSS/pdeleteres.png" style="zoom:100%">
        </p>
      
      <br>    

[↑ Back to top](#top)

<br>

### Update a patient by name: `p update`

* If a patient reports a change of address, phone number, or any other information, you can update the information of that patient with the `p update` command.
  \
  &nbsp;
* **Format:** `p update PATIENT_NAME [-n NEW_NAME] [-ph NEW_PHONE_NUMBER] [-em NEW_EMAIL] [-ad NEW_ADDRESS] [-dob NEW_DATE_OF_BIRTH] [-g GENDER] [-ic IC] [-da PATIENT_DRUG_ALLERGY] [-ec NEW_EMERGENCY_CONTACT_NUMBER]`
    * When you wish to update some, if not all information of a patient, simply include the parameters that you wish to update.
      \
      &nbsp;
* **Example:**
    * Suppose we wish to update the phone number, email address, emergency contact number of John to be 91234567, johndoe@example.com and 98765432 respectively. The command would be:`p update John Doe -ph 91234567 -em johndoe@example.com -ec 98765432`
      <p align="center">
            <img src="images/UIscreenshots/patientSS/pupdate.png" style="zoom:100%">
      </p>
      <br>
    * A message response will be printed on the screen, informing you that your command has been successfully executed!
      <p align="center">
            <img src="images/UIscreenshots/patientSS/pupdateres.png" style="zoom:100%">
      </p>
      <br>
    * Suppose we wish to update the name and drug allergy of Bety to be Betsy Crowers and Aspirin respectively. The command would be:`p update Bety -n Betsy Crower -da Aspirin`

    <br>

[↑ Back to top](#top)

<br>

### Retrieve a Patient record by name: `p find`
* You can quickly retrieve the information of a patient by searching with his or her name.
  \
  &nbsp;
* **Format:** `p find PATIENT_NAME`
    * The search is case-insensitive. e.g hans will match Hans
      \
      &nbsp;
* **Examples:**
    * `p find Doe` returns David Doe and John Doe
      <p align="center">
            <img src="images/UIscreenshots/patientSS/patientFindresult.png" style="zoom:100%">
      </p>
      <br>
    * You can click on either record to see detailed information.

<br>

[↑ Back to top](#top)

<br>

### View a patient's full information: `p view`

* The index refers to the index number shown in the displayed patient list.
* You can view detailed information of a patient with the `view` command. The full detail of the retrieved patient will be shown on the right side of the application.
  \
  &nbsp;
* **Format:** `p view -i PATIENT_INDEX`
  \
  &nbsp;
* **Example:** `p view -i 1`
    * You can enter `p view -i 1` to see the information of the first patient in the list.
      <p align="center">
            <img src="images/UIscreenshots/patientSS/pview.png" style="zoom:100%">
      </p>
      
      <br>

[↑ Back to top](#top)

<br>


### Clear all Patient records : `p clear`

* You can also clears all patient records  in case you wish to terminate your subscription with CareFlow and move on to another system. Run this command with caution!
  \
  &nbsp;
* **Format:** `p clear`
  \
  &nbsp;
* **Example:** `p clear`
    * All patient records will be permanantly removed from the system
      <p align="center">
            <img src="images/UIscreenshots/patientSS/pclear.png" style="zoom:100%">
      </p>
      
      <br>

[↑ Back to top](#top)

<br> 


### List all Patient records : `p list`

* You can use the `list` command to see the list of all patients currently stored in the CareFlow system. Patient records will be presented in alphabetical order.
  \
  &nbsp;
* **Format:** `p list`
  \
  &nbsp;
* **Example:**
    <p align="center">
          <img src="images/UIscreenshots/patientSS/patientList.png" style="zoom:100%">
    </p>
  
    <br>

[↑ Back to top](#top)

<br>


___

## 4.3 Drug Operations

### Add a Drug entry: `d add`
* You can add a new drug to the list of drugs in case your clinic decides to start prescribing a new drug.
  \
  &nbsp;
* **Format:** `d add -tn TRADE_NAME -ai ACTIVE_INGREDIENT -dir DIRECTIONS -pur PURPOSE -se SIDE_EFFECTS -sc STORAGE_COUNT`
  \
  &nbsp;
* **Example:**
    * Suppose you wish to add Panadol to you list of drugs, including all relevant pieces of information such as the active ingredient, the direction, side effect and storage count. Your command could look something like:`d add -tn Panadol -ai Paracetamol -dir Adults and children above 12 years old, 1-2 capsules every 4-6 hours -pur treat fever, headache, toothache, rheumatic and muscle pains -se dizziness, fatigue -sc 500`
      <p align="center">
            <img src="images/UIscreenshots/drugSS/dadd.png" style="zoom:100%">
      </p>
      <br>
    * A message response will be printed on the screen, informing you that your command has been successfully executed!
      <p align="center">
            <img src="images/UIscreenshots/drugSS/daddres.png" style="zoom:100%">
      </p>
      
      <br>

[↑ Back to top](#top)

<br>


### Delete a Drug entry by TRADE_NAME: `d delete`
* If your clinic decides to stop prescribing a certain drug, you can also deletes the specified drug with the `d delete` command by specifying the trade name of the drug.
  \
  &nbsp;
* **Format:** `d delete -tn TRADE_NAME`
  \
  &nbsp;
* **Example:**
    * Suppose for some reason, you wish to delete Panadol, your command should look something like:`d delete -tn Panadol`
      <p align="center">
            <img src="images/UIscreenshots/drugSS/ddeletetn.png" style="zoom:100%">
      </p>
      <br>
    * Drug to be Deleted:
      <p align="left">
          <img src="images/UIscreenshots/drugSS/dpanadol.png" style="zoom:25%">
      </p>
      <br>
    * A message response will be printed on the screen, informing you that your command has been successfully executed!
      <p align="center">
            <img src="images/UIscreenshots/drugSS/ddeletetnres.png" style="zoom:100%">
      </p>
      <br>

[↑ Back to top](#top)

<br>


### Delete a Drug entry by INDEX : `d delete`
* You can also delete a specified drug from the drug list by specifying its index in the drug list.
  \
  &nbsp;
* **Format:** `d delete -i DRUG_INDEX`
  \
  &nbsp;
* **Example:**
    * Suppose you wish to remove the 4th drug in the list you're currently looking at, your command should look something like:`d delete -i 4`
      <p align="center">
            <img src="images/UIscreenshots/drugSS/ddeleteindex.png" style="zoom:100%">
      </p>
      <br>
    * Drug to be Deleted:
      <p align="center">
            <img src="images/UIscreenshots/drugSS/d4.png" style="zoom:100%">
      </p>
      <br>
    * A message response will be printed on the screen, informing you that your command has been successfully executed!
      <p align="center">
            <img src="images/UIscreenshots/drugSS/ddeletetnres.png" style="zoom:100%">
      </p>
      <br>

[↑ Back to top](#top)

<br>


### Update storage count of a Drug entry: `d update`
* You can update the storage count of specified drug entry by specifying the trade name.
* NOTE: you need to prefix the value with + or - for addition and subtraction respectively
  \
  &nbsp;
* **Format:** `d update TRADE_NAME -by +VALUE` OR `d update TRADE_NAME -by -VALUE`
  \
  &nbsp;
* **Examples:**
    * If your clinic has prescribed 10 boxes of Panadol and you wish to reduce the storage of Panadol accordingly, your command should look something like: `d update Panadol -by -10`
    * Drug to be Updated (The storage is currently 55 boxes.):
      <p align="left">
            <img src="images/UIscreenshots/drugSS/drugPrevCount.png" style="zoom:25%"> <br>
      </p>
      <br>
    * Enter your command and hit `Enter`. A message response will be printed on the screen, informing you that your command has been successfully executed!
      <p align="center">
            <img src="images/UIscreenshots/drugSS/dupdate.png" style="zoom:100%">
      </p>
      <br>
      
    * The storage of Panadol is now 45
        <p align="left">
          <img src="images/UIscreenshots/drugSS/drugCurrentCount.png" style="zoom:25%">
        </p>
    <br>

[↑ Back to top](#top)

<br>


### Retrieve a Drug entry by TRADE_NAME: `d find`
* You can quickly retrieve the information of a drug by using the `d find` command and specify the trade name of the drug you want to search.
  \
  &nbsp;
* **Format:** `d find TRADE_NAME`
    * The search is case-insensitive. e.g panadol will match Panadol.
      \
      &nbsp;
* **Examples:**
    * If you want to check the information of Panadol, your command should look something like: `d find Panadol`
      <p align="center">
            <img src="images/UIscreenshots/drugSS/dfind.png" style="zoom:100%">
      </p>
      <br>
    * You should see Panadol being shown on the drug list as well as the display window on the right
      <p align="center">
            <img src="images/UIscreenshots/drugSS/dFindPanadol.png" style="zoom:100%">
      </p>
      
      <br>

[↑ Back to top](#top)

<br>


### Clear all Drug entries : `d clear`
* You can clear all records of drugs. Use this with caution!
  \
  &nbsp;
* **Format:** `d clear`
  \
  &nbsp;
* **Example:**
    * Enter the command `d clear` and all drug information will be permanantly removed.
      <p align="center">
            <img src="images/UIscreenshots/drugSS/dclearres.png" style="zoom:100%">
      </p>
      <br>

[↑ Back to top](#top)

<br>


### List all Drug entries: `d list`
* You can view all drug records currently stored in the CareFlow system by using the `d list` command, drug records will be presented in alphabetical order.
  \
  &nbsp;
* **Format:** `d list`
  \
  &nbsp;
* **Example:** `d list`
    * Enter `d list` and all drug records will be shown on the screen.
      <p align="center">
            <img src="images/UIscreenshots/drugSS/dlist.png" style="zoom:100%">
      </p>
      <br>

[↑ Back to top](#top)

<br>


### View a drug by index: `d view`
* You can view detailed information of a drug in the careflow. The full details of the selected drug will be shown on the right side of the application.
* Index refers to the index number shown in the displayed drug list.
  \
  &nbsp;
* **Format:** `d view -i DRUG_INDEX`
  \
  &nbsp;
* **Example:**
    * If you wish to view details/all information of the drug at index 1, your commnad would be: `d view -i 1`
    * Type in the command and hit `Enter`, detailed information of Panadol will be shown on the window at the right side.
      <p align="center">
            <img src="images/UIscreenshots/drugSS/dview.png" style="zoom:80%">
      </p>
      <br>

[↑ Back to top](#top)

<br>


### Saving the data

* CareFlow data is saved in the hard disk automatically after any command that changes the data. There is no need to save manually.
  
<br>

[↑ Back to top](#top)

<br>


### Editing the data file

* All CareFlow data is saved as a JSON file `[JAR file location]/data/careflow.json`. If you are an advanced user, you can also update data directly by editing that data file.

<div markdown="span" class="alert alert-warning">:exclamation: **Caution:**
If your changes to the data file makes its format invalid, CareFlow will discard all data and start with an empty data file at the next run.
</div>

<br>

[↑ Back to top](#top)

<br>


## Archiving data files `[coming in v2.0]`

_Details coming soon ..._

--------------------------------------------------------------------------------------------------------------------

# **5. FAQ**

**Q**: How do I transfer my data to another Computer?<br>
**A**: You can install the app in the other computer and **replace** the empty data file it creates with the file that contains the data of your previous CareFlow home folder.

<br>

[↑ Back to top](#top)


--------------------------------------------------------------------------------------------------------------------

# **6. Command Summary**

If you need a quick and easy way to find the commands available in CareFlow, simply refer to the list below

## 6.1 General Commands

The following are the general commands that are available in Careflow for you to use! You will need to use the prefix `g` to use the commands.

| Action | Format, Example | Expected Outcome |
| -------|--------|------------------|
| **Help** | `g help` | Opens up a window with a link to the User Guide. |
| **Exit** | `g exit` | Saves all data and safely exits. |

## 6.2 Patient Commands

The following commands are patient-related commands that are available in Careflow for you to use! You will need to use the prefix `p` to use the commands.

| Action | Format, Example                                                                                                                                                                                                                                                                                | Expected Outcome |
| -------|------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|------------------|
| **Add patient**  | `p add -n PATIENT_NAME -ph PHONE_NUMBER -em EMAIL -ad ADDRESS -dob DATE_OF_BIRTH -g GENDER -ic NRIC [-da DRUG_ALLERGY] [-ec EMERGENCY_CONTACT_NUMBER]` <p> e.g., `p add -n John Doe -ph 98765432 -em johnd@example.com -ad John Street, Block 123, #01-01 -dob 21-01-2000 -g male -ic T3871918C` | Adds a patient record with the particulars that you have entered.|
| **Delete patient by index**   | `p delete -i PATIENT_INDEX` e.g., `p delete -i 3`                                                                                                                                                                                                                                              | Removes patient record at the index you have selected.|
| **Delete patient by NRIC**    | `p delete -ic PATIENT_NRIC` e.g., `p delete -ic T0021248C`                                                                                                                                                                                                                                  | Removes patient record associated with the provided IC number.|
| **Update patient by name**    | `p update PATIENT_NAME [-n NAME] [-ph PHONE] [-em EMAIL] [-ad ADDRESS] [-dob DATE_OF_BIRTH] [-g GENDER] [-ic IC] [-da DRUG_ALLERGY] [-ec NEW_EMERGENCY_CONTACT_NUMBER]` <p> e.g., `p update John -ph 12345678 -em 23456789`                                                                    | Edit patient details located at the i-th position in the patient list with your given arguments.|
| **View patient by index**     | `p view -i PATIENT_INDEX` e.g. `p view -i 1`                                                                                                                                                                                                                                                | Shows the patient record located at the i-th position in the patient list.|
| **Find patient by name**      | `p find PATIENT_NAME` e.g., `p find John`                                                                                                                                                                                                                                                   | Shows patient(s) record that match the patient name you have provided.|
| **Clear all patient**         | `p clear`                                                                                                                                                                                                                                                                                      | Removes all patient records stored in CareFlow.|
| **List patient**              | `p list`                                                                                                                                                                                                                                                                                       | Lists all the patients that have been recorded in CareFlow.| 

## 6.3 Drug Commands

The following commands are drug-related commands that are available in Careflow for you to use! You will need to use the prefix `d` to use the commands.

| Action | Format                                                                                                                                                                                                                                         | Expected Outcome |
| -------|------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|------------------|
| **Add a drug**                | `d add -tn TRADE_NAME -ai ACTIVE_INGREDIENT -dir DIRECTIONS -pur PURPOSE -se SIDE_EFFECTS -sc STORAGE_COUNT` <br> e.g., `d add -tn Panadol -ai paracetamol, sodium -dir Adults, 1-2 capsules -pur treat fever, headache -se dizziness -sc 500` | Adds a drug record with the particulars that you have entered. |
| **Delete drug by index**      | `d delete -i INDEX`<br> e.g.,`d delete -i 7`                                                                                                                                                                                                   | Removes drug record at the index you have selected.|
| **Delete drug by trade name** | `d delete -tn TRADE_NAME`<br> e.g., `d delete -tn Panadol Flu Max`                                                                                                                                                                             | Removes drug record associated with the provided trade name.|
| **Update drug storage count** | `d update TRADE_NAME -by +-VALUE`<br> e.g.,`d update -tn Panadol Flu Max -by +90`                                                                                                                                                              | Edit drug's storage count with the provided trade name.|
| **View drug by index**        | `d view -i DRUG_INDEX` <br> e.g. `d view -i 1`                                                                                                                                                                                                  | Shows the drug record located at the i-th position in the drug list.|
| **Find drug by trade name**   | `d find TRADE_NAME` <br> e.g., `d find Panadol`                                                                                                                                                                                                | Shows drug(s) record that match the drugs' trade name you have provided.|
| **List drug**                 | `d list`                                                                                                                                                                                                                                       | Lists all the drugs that have been recorded in CareFlow. |
| **Clear all drugs**           | `d clear`                                                                                                                                                                                                                                      | Removes all drug records stored in CareFlow |

[↑ Back to top](#top)
