/**
 * Question 7: Implement the Composite design pattern to maintain the
 * directories of employees on the basis of departments
 */

import java.util.ArrayList;
import java.util.List;

// Component
interface Directory {
    void showDirectoryDetails();
}

// Leaf
class JVMDeveloper implements Directory {
    String jvmDeveloperName;
    int jvmDeveloperID;
    
    JVMDeveloper(String jvmDeveloperName, int jvmDeveloperID) {
        this.jvmDeveloperName = jvmDeveloperName;
        this.jvmDeveloperID = jvmDeveloperID;
    }
    
    @Override
    public void showDirectoryDetails() {
        System.out.println("JVM Developer: ID - " + jvmDeveloperID + ", Name - " + jvmDeveloperName);
    }
}

// Leaf
class AMCDeveloper implements Directory {
    String amcDeveloperName;
    int amcDeveloperID;
    
    public AMCDeveloper(String amcDeveloperName, int amcDeveloperID) {
        this.amcDeveloperName = amcDeveloperName;
        this.amcDeveloperID = amcDeveloperID;
    }
    
    @Override
    public void showDirectoryDetails() {
        System.out.println("AMC Developer: ID - " + amcDeveloperID + ", Name - " + amcDeveloperName);
    }
}

// Composite
class JVMDeveloperDirectory implements Directory {
    List<Directory> directoryList = new ArrayList<>();
    
    @Override
    public void showDirectoryDetails() {
        System.out.println("___JVM Developers Directory___");
        directoryList.forEach(directory -> directory.showDirectoryDetails());
        
    }
}

// Composite
class AMCDeveloperDirectory implements Directory {
    List<Directory> directoryList = new ArrayList<>();
    
    @Override
    public void showDirectoryDetails() {
        System.out.println("___AMC Developers Directory___");
        directoryList.forEach(directory -> directory.showDirectoryDetails());
    }
}

// Composite
class TTNDirectory implements Directory {
    List<Directory> directoryList = new ArrayList<>();
    
    @Override
    public void showDirectoryDetails() {
        System.out.println("___TTN Employee Directory___");
        directoryList.forEach(directory -> directory.showDirectoryDetails());
    }
}

// Client
public class CompositeDemo {
    public static void main(String[] args) {
        JVMDeveloper jvmDeveloper1 = new JVMDeveloper("Deepika", 3322);
        jvmDeveloper1.showDirectoryDetails();
        
        JVMDeveloper jvmDeveloper2 = new JVMDeveloper("Souvik", 3398);
        jvmDeveloper2.showDirectoryDetails();
        
        AMCDeveloper amcDeveloper1 = new AMCDeveloper("Divya", 3338);
        amcDeveloper1.showDirectoryDetails();
        
        AMCDeveloper amcDeveloper2 = new AMCDeveloper("Dhruv", 3389);
        amcDeveloper2.showDirectoryDetails();
        
        JVMDeveloperDirectory jvmDeveloperDirectory = new JVMDeveloperDirectory();
        jvmDeveloperDirectory.directoryList.add(jvmDeveloper1);
        jvmDeveloperDirectory.directoryList.add(jvmDeveloper2);
        jvmDeveloperDirectory.showDirectoryDetails();
        
        AMCDeveloperDirectory amcDeveloperDirectory = new AMCDeveloperDirectory();
        amcDeveloperDirectory.directoryList.add(amcDeveloper1);
        amcDeveloperDirectory.directoryList.add(amcDeveloper2);
        amcDeveloperDirectory.showDirectoryDetails();
        
        TTNDirectory ttnDirectory = new TTNDirectory();
        ttnDirectory.directoryList.add(jvmDeveloperDirectory);
        ttnDirectory.directoryList.add(amcDeveloperDirectory);
        ttnDirectory.showDirectoryDetails();
    }
}
