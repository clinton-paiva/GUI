/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
/**
 *
 * @author clinton.paiva
 */
public class Gui extends JFrame implements WindowListener,ActionListener {

    /**
     * @param args the command line arguments
     */
    
    private Frame mainFrame;
	private Label headerLabel;
	private Panel controlPanel;
	private JTextField testURL; 
	private JTextField ResultURL; 
	private Button Run; 
	private Button Close; 
	private TextArea filelist;
	public Gui() {
		prepareGUI();
		 
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Gui  awtLayoutDemo = new Gui();  
	    awtLayoutDemo.Intro();
	
	}
	
	private void prepareGUI() {
		mainFrame = new Frame("Mocha Framework");
	    mainFrame.setSize(800,800);
	    mainFrame.setLayout(new GridLayout(3, 1));
	    mainFrame.addWindowListener(new WindowAdapter() {
	    	public void windowClosing(WindowEvent windowEvent){
	            System.exit(0);
	         }        
	      });    
	      headerLabel = new Label();
	      headerLabel.setAlignment(Label.CENTER);
	      
	      controlPanel = new Panel();
	      controlPanel.setLayout(new FlowLayout());

	      mainFrame.add(headerLabel);
	      mainFrame.add(controlPanel);
	      mainFrame.setVisible(true);  
	   }

	   private void Intro(){
	      headerLabel.setText("Mocha Testing Framework");      

	      Panel panel = new Panel();
	      panel.setBackground(Color.white);
	      panel.setSize(600,600);
	      GridLayout layout = new GridLayout(3,1);
	      layout.setHgap(10);
	      layout.setVgap(10);
	      
	      panel.setLayout(layout);    
	      
	      testURL=new JTextField();
	      testURL.setText("Enter Test URL");
	      ResultURL=new JTextField();
	      ResultURL.setText("Enter Result URL");
	      panel.add(testURL);
	      panel.add(ResultURL);
	      
	      panel.add(new JCheckBox("Chrome"));
	      panel.add(new JCheckBox("Firefox"));
	      
	      Run=new Button();
	      Run.setLabel("Run");
	      panel.add(Run); 
	      Close=new Button();
	      Close.setLabel("Close");
	      panel.add(Close); 
	    /*
	      Label textarea=new Label();
	      textarea.setText("Enter Test Files");
	      filelist=new TextArea(2,2);
	      filelist.setText("Enter File Name's to be executed");
	      panel.add(filelist);*/
	     	      
	      controlPanel.add(panel);
	      mainFrame.setVisible(true);  
	      
	      Run.addActionListener(this);		  
       
	   }
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		execute();
			
	}
	@Override
	public void windowActivated(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowClosed(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowClosing(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowDeactivated(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowDeiconified(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowIconified(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowOpened(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	
	
	public void execute(){
		String testurl=testURL.getText();
		String resulturl=ResultURL.getText();
		System.out.println(testurl+" "+resulturl);
		
		
		long start = java.util.Calendar.getInstance().getTimeInMillis();
		//mPower main file source
		String testfileurl=testurl;
		String resultfolder=resulturl+"MOCHA RESULTS";
        String zipfileloc=resulturl+"\\MOCHA_RESULTS.zip";
		String input1 = testfileurl+"main-mpower.js";
        String output1 = testfileurl+"main-mpower1.js"; 
        System.out.println("\n"+input1+" "+resultfolder+"\n");
      //Creating Results Folder
       /* File results = new File(testfileurl+"MOCHA RESULTS");
        if (!results.exists()) {
            System.out.println("Creating Directory: " + results);
            boolean result = false;
            try{
                results.mkdir();
                result = true;
            } 
            catch(SecurityException se){
                //handle it
            }        
            if(result) {    
                System.out.println("Created Folder to store Results");  
            }
        }
        
        String resultfolder=testfileurl+"MOCHA RESULTS";
        String zipfileloc=testfileurl+"MOCHA_RESULTS.zip"; */       
        File deletefolder = new File(resultfolder); 
        File deletedir = new File(resultfolder); 
        
        //Comment Patterns
        String pattern1="/**";        String pattern11="**/";
       // String pattern2="/*#";        String pattern22="#*/";
       // String pattern3="/*$";        String pattern33="$*/";
        //String pattern4="/*%";        String pattern44="%*/";
        //String pattern5="/*_";        String pattern55="_*/";
        //String pattern6="/*+";        String pattern66="+*/";
        
        
			try {
				converting(input1,output1,pattern1,pattern11);
			} catch (IOException e2) {
				// TODO Auto-generated catch block
				e2.printStackTrace();
			} catch (InterruptedException e2) {
				// TODO Auto-generated catch block
				e2.printStackTrace();
			}
		
   /*     try {
			converting(input1,output1,pattern2,pattern22);
		} catch (IOException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		} catch (InterruptedException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
        try {
			converting(input1,output1,pattern3,pattern33);
		} catch (IOException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		} catch (InterruptedException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
        try {
			converting(input1,output1,pattern4,pattern44);
		} catch (IOException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		} catch (InterruptedException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
        try {
			converting(input1,output1,pattern5,pattern55);
		} catch (IOException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		} catch (InterruptedException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		} 
        try {
			converting(input1,output1,pattern6,pattern66);
		} catch (IOException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		} catch (InterruptedException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}*/
        
        //Zipping Results
       
			try {
				zipFolder(resultfolder, zipfileloc);
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		
        
        //Deleting result HTML files from the folder after creation of the ZIP
        purgeFiles(deletefolder);
        purgeDirectory(deletedir);

	    long end = java.util.Calendar.getInstance().getTimeInMillis();
	    long finaltime= end-start;
	    long minutes = (int) ((finaltime / (1000*60)) % 60);
	    System.out.println("\nTotal time taken for complete execution is: " + minutes + "mins");
	  
	    System.exit(0);
	}
	
	public static void converting(String input1, String output1, String pattern1, String pattern2) throws IOException, InterruptedException{
	    // Create mocha test batches.
		int pos=0, flag=0, flag1=0;
	    BufferedReader reader = new BufferedReader(new FileReader(input1));
	    BufferedWriter writer = new BufferedWriter(new FileWriter(output1));
	    System.out.println("\nSegregating Test Cases at lines:");
	    // Loop over lines in the file and write into new file.
	    while (true) {
	        String line = reader.readLine();
	        
	        if (line == null) {
	       		break;
	        }
	        pos++;
	        //Replace Starting Pattern
	        String pattern = pattern1;
	        Pattern patternn = Pattern.compile(Pattern.quote(pattern));
	        Matcher matcher2 = patternn.matcher(line);
	        while (matcher2.find()){
	        	flag=pos;
	        	System.out.println(flag);
	        	line=line.replace(pattern1, "")  ;           
	        }
	        //Replace Ending Pattern
	        String patterrn = pattern2;
	        Pattern patteern = Pattern.compile(Pattern.quote(patterrn));
	        Matcher matcher1 = patteern.matcher(line);
	        while (matcher1.find()){
	        	flag1=pos;
	        	System.out.println(flag1);
	        	line=line.replace(pattern2, ""); 
	        }
	        writer.write(line); 
            writer.newLine();
	  	}
	    writer.close();
	    // Close the BufferedReader.
	   	reader.close();
	   	
	   	//Write back into original file
		BufferedReader reader1 = new BufferedReader(new FileReader(output1));
		BufferedWriter writer1 = new BufferedWriter(new FileWriter(input1));
		while (true) {
		    String line = reader1.readLine();
		    if (line == null) {
		    	break;
		    }
		    writer1.write(line); 
		    writer1.newLine();
		 }
		writer1.close();
		// Close the BufferedReader and Delete Duplicate File.
		reader1.close();
		File file = new File(output1);
		file.delete();
		
		//Firefox function to clear cache, run and save test cases
		runfirefox();
		//Re-comment test suites
		recomment(input1,output1,pattern1,pattern2,flag,flag1);
		return;
	}
	
	public static void recomment(String input1, String output1, String pattern1, String pattern2, int flag, int flag1) throws IOException, InterruptedException{
		//Re-commenting code
		int pos=0;
		BufferedReader reader2 = new BufferedReader(new FileReader(input1));
		BufferedWriter writer2 = new BufferedWriter(new FileWriter(output1));
		System.out.println("Rewriting Comments at lines:");
		// Loop over lines in the file and write into new file.
		while (true) {
		     String line = reader2.readLine();
		        
		     if (line == null) {
		       		break;
		     }
		     pos++;
		     //Replace Starting Comments
		     if (pos == flag){
		    	   System.out.println(pos);
		    	   line=pattern1;
		     }
		     //Replace Ending Comments
		     if (pos == flag1){
		    	 	System.out.println(pos);
		    	 	line=pattern2;  
			 }
			 writer2.write(line); 
			 writer2.newLine(); 
		}
		writer2.close();
		// Close the BufferedReader.
		reader2.close();
		//Write back into original file
		BufferedReader reader3 = new BufferedReader(new FileReader(output1));
		BufferedWriter writer3 = new BufferedWriter(new FileWriter(input1));
			while (true) {
			    String line = reader3.readLine();
			    if (line == null) {
		 		    	break;
			    }
			    writer3.write(line); 
			    writer3.newLine();
			}
		writer3.close();
		// Close the BufferedReader and Delete Duplicate File.
		reader3.close();
		File file1 = new File(output1);
		file1.delete();
	}
	
	public static void runfirefox() throws IOException, InterruptedException {
		System.out.println("Clearing Cache");
		
		//Clearing Cache
		Runtime.getRuntime().exec("C:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe");
		TimeUnit.SECONDS.sleep(2);
		Robot robot1;
		try {
			robot1 = new Robot();
			robot1.keyPress(KeyEvent.VK_F9); 
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		TimeUnit.SECONDS.sleep(2);
		Runtime.getRuntime().exec("taskkill /F /IM firefox.exe");
		TimeUnit.SECONDS.sleep(2);

		//Executing Test Cases
		System.out.println("Executing Test Cases");
		Runtime.getRuntime().exec("C:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe http://localhost/ui/test/mpower.html");
		System.out.println("Running");
		
		//Saving testcase results
		TimeUnit.SECONDS.sleep(165);
		System.out.println("Saving Results");
		TimeUnit.SECONDS.sleep(1);
		Robot robot;
		try {
			robot = new Robot();
			robot.keyPress(KeyEvent.VK_CONTROL); 
			robot.keyPress(KeyEvent.VK_S);
			robot.keyRelease(KeyEvent.VK_S);
			robot.keyRelease(KeyEvent.VK_CONTROL);
			TimeUnit.SECONDS.sleep(2);
			robot.keyPress(KeyEvent.VK_1);
			robot.keyRelease(KeyEvent.VK_1);
			TimeUnit.SECONDS.sleep(1);
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
			TimeUnit.SECONDS.sleep(2);
			robot.keyPress(KeyEvent.VK_N);
			robot.keyRelease(KeyEvent.VK_N);
			TimeUnit.SECONDS.sleep(2);
			robot.keyPress(KeyEvent.VK_2);
			robot.keyRelease(KeyEvent.VK_2);
			TimeUnit.SECONDS.sleep(1);
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
			TimeUnit.SECONDS.sleep(2);
			robot.keyPress(KeyEvent.VK_N);
			robot.keyRelease(KeyEvent.VK_N);
			TimeUnit.SECONDS.sleep(2);
			robot.keyPress(KeyEvent.VK_3);
			robot.keyRelease(KeyEvent.VK_3);
			TimeUnit.SECONDS.sleep(1);
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
			TimeUnit.SECONDS.sleep(2);
			robot.keyPress(KeyEvent.VK_N);
			robot.keyRelease(KeyEvent.VK_N);
			TimeUnit.SECONDS.sleep(2);
			robot.keyPress(KeyEvent.VK_4);
			robot.keyRelease(KeyEvent.VK_4);
			TimeUnit.SECONDS.sleep(1);
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
			TimeUnit.SECONDS.sleep(2);
			robot.keyPress(KeyEvent.VK_N);
			robot.keyRelease(KeyEvent.VK_N);
			TimeUnit.SECONDS.sleep(2);
			robot.keyPress(KeyEvent.VK_5);
			robot.keyRelease(KeyEvent.VK_5);
			TimeUnit.SECONDS.sleep(1);
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
			TimeUnit.SECONDS.sleep(2);
			robot.keyPress(KeyEvent.VK_N);
			robot.keyRelease(KeyEvent.VK_N);
			TimeUnit.SECONDS.sleep(2);
			robot.keyPress(KeyEvent.VK_6);
			robot.keyRelease(KeyEvent.VK_6);
			TimeUnit.SECONDS.sleep(1);
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
			TimeUnit.SECONDS.sleep(2);
			
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		TimeUnit.SECONDS.sleep(3);
		//proc.waitFor();
		//Stopping Firefox 
		System.out.println("Completed");
		Runtime.getRuntime().exec("taskkill /F /IM firefox.exe");
		System.out.println("Closed Browser");
	}
	


	//Zipping the Results
	  static public void zipFolder(String srcFolder, String destZipFile) throws Exception {
	    ZipOutputStream zip = null;
	    FileOutputStream fileWriter = null;
	    System.out.println("Zipping the Result Files");
	    fileWriter = new FileOutputStream(destZipFile);
	    zip = new ZipOutputStream(fileWriter);
	    addFolderToZip("", srcFolder, zip);
	    zip.flush();
	    zip.close();
	    fileWriter.close();
	  }
	  static private void addFileToZip(String path, String srcFile, ZipOutputStream zip)
	      throws Exception {
	    File folder = new File(srcFile);
	    if (folder.isDirectory()) {
	      addFolderToZip(path, srcFile, zip);
	    } else {
	      byte[] buf = new byte[1024];
	      int len;
	      FileInputStream in = new FileInputStream(srcFile);
	      zip.putNextEntry(new ZipEntry(path + "/" + folder.getName()));
	      while ((len = in.read(buf)) > 0) {
	        zip.write(buf, 0, len);
	      }
	      in.close();
	    }
	  }

	  static private void addFolderToZip(String path, String srcFolder, ZipOutputStream zip) throws Exception {
	    File folder = new File(srcFolder);
	    for (String fileName : folder.list()) {
	      if (path.equals("")) {
	        addFileToZip(folder.getName(), srcFolder + "/" + fileName, zip);
	      } else {
	        addFileToZip(path + "/" + folder.getName(), srcFolder + "/" +   fileName, zip);
	      }
	    }
	    
	  }
	  
	  //Deleting Result files from the folder
	  static private void purgeFiles(File dir) {
		    System.out.println("Deleting the Result Files");
		    for (File file: dir.listFiles()) {
		    	System.out.println("Deleting: "+file);
		    	if (!file.isDirectory()){
		    		boolean check=file.delete();
		    		if(check==true){
		    			System.out.println("Deleted");
		    		}else{
		    			System.out.println("Delete Failed");
		    		}
		    	}
		    }
	  }
	//Deleting Result folders from the folder
	  static void purgeDirectory(File dir) {
		    for (File file: dir.listFiles()) {
		    	System.out.println("Deleting folder file: "+file);
		        if (file.isDirectory()) purgeDirectory(file);
		        file.delete();
		    }
		}
	   
    
}
