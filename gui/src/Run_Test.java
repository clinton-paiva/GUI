
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author clinton.paiva
 */
public class Run_Test extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public Run_Test() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        testURL = new javax.swing.JTextField();
        ResultURL = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        Chrome = new javax.swing.JCheckBox();
        Firefox = new javax.swing.JCheckBox();
        IE = new javax.swing.JCheckBox();
        jPanel3 = new javax.swing.JPanel();
        jTextField3 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        filelist = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Checkout Folder");

        jLabel2.setText("Result Folder");

        testURL.setText("C:\\\\wamp\\\\www\\\\GIT\\\\Trunk\\\\ui\\\\test\\\\");
            testURL.addKeyListener(new java.awt.event.KeyAdapter() {
                public void keyTyped(java.awt.event.KeyEvent evt) {
                    testURLKeyTyped(evt);
                }
            });

            ResultURL.setText("C:\\\\Users\\\\clinton.paiva\\\\Desktop\\\\");

                javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
                jPanel1.setLayout(jPanel1Layout);
                jPanel1Layout.setHorizontalGroup(
                    jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(testURL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 79, Short.MAX_VALUE)
                        .addComponent(ResultURL, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(54, 54, 54))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(112, 112, 112)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(103, 103, 103))
                );
                jPanel1Layout.setVerticalGroup(
                    jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(testURL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ResultURL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(37, Short.MAX_VALUE))
                );

                Chrome.setText("Chrome");
                Chrome.addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        ChromeActionPerformed(evt);
                    }
                });

                Firefox.setText("Firefox");

                IE.setText("IE");

                javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
                jPanel2.setLayout(jPanel2Layout);
                jPanel2Layout.setHorizontalGroup(
                    jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(Chrome)
                        .addGap(70, 70, 70)
                        .addComponent(Firefox)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 73, Short.MAX_VALUE)
                        .addComponent(IE)
                        .addGap(56, 56, 56))
                );
                jPanel2Layout.setVerticalGroup(
                    jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Chrome)
                            .addComponent(Firefox)
                            .addComponent(IE))
                        .addContainerGap(23, Short.MAX_VALUE))
                );

                jTextField3.setText("Test File Location");
                jTextField3.addKeyListener(new java.awt.event.KeyAdapter() {
                    public void keyTyped(java.awt.event.KeyEvent evt) {
                        jTextField3KeyTyped(evt);
                    }
                });

                jLabel3.setText("Test Folder");

                filelist.setColumns(20);
                filelist.setRows(5);
                jScrollPane1.setViewportView(filelist);

                javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
                jPanel3.setLayout(jPanel3Layout);
                jPanel3Layout.setHorizontalGroup(
                    jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                .addGap(107, 107, 107)
                                .addComponent(jLabel3)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addContainerGap(22, Short.MAX_VALUE)
                                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())
                );
                jPanel3Layout.setVerticalGroup(
                    jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                );

                jButton1.setBackground(new java.awt.Color(0, 204, 51));
                jButton1.setText("Run");
                jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
                    public void mouseClicked(java.awt.event.MouseEvent evt) {
                        jButton1MouseClicked(evt);
                    }
                });

                jButton2.setBackground(new java.awt.Color(204, 0, 0));
                jButton2.setText("Close");
                jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
                    public void mouseClicked(java.awt.event.MouseEvent evt) {
                        jButton2MouseClicked(evt);
                    }
                });

                jLabel4.setFont(new java.awt.Font("Century Schoolbook", 1, 24)); // NOI18N
                jLabel4.setText("MOCHA TESTING FRAMEWORK");

                jButton3.setBackground(new java.awt.Color(0, 153, 204));
                jButton3.setText("Upload NewTest File");

                jMenu1.setText("Run Tests");
                jMenuBar1.add(jMenu1);

                jMenu2.setText("Create Tests");
                jMenu2.addMenuListener(new javax.swing.event.MenuListener() {
                    public void menuCanceled(javax.swing.event.MenuEvent evt) {
                    }
                    public void menuDeselected(javax.swing.event.MenuEvent evt) {
                    }
                    public void menuSelected(javax.swing.event.MenuEvent evt) {
                        jMenu2MenuSelected(evt);
                    }
                });
                jMenu2.addMenuKeyListener(new javax.swing.event.MenuKeyListener() {
                    public void menuKeyPressed(javax.swing.event.MenuKeyEvent evt) {
                        jMenu2MenuKeyPressed(evt);
                    }
                    public void menuKeyReleased(javax.swing.event.MenuKeyEvent evt) {
                    }
                    public void menuKeyTyped(javax.swing.event.MenuKeyEvent evt) {
                    }
                });
                jMenuBar1.add(jMenu2);

                setJMenuBar(jMenuBar1);

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
                getContentPane().setLayout(layout);
                layout.setHorizontalGroup(
                    layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(106, 106, 106)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(79, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(129, 129, 129))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jButton2)
                                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(35, 35, 35))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(48, 48, 48)
                                .addComponent(jButton1)
                                .addGap(154, 154, 154)
                                .addComponent(jButton3))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(174, 174, 174)
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                );
                layout.setVerticalGroup(
                    layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1)
                            .addComponent(jButton3)
                            .addComponent(jButton2))
                        .addGap(39, 39, 39))
                );

                pack();
            }// </editor-fold>//GEN-END:initComponents

    private void ChromeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChromeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ChromeActionPerformed

    private void jMenu2MenuSelected(javax.swing.event.MenuEvent evt) {//GEN-FIRST:event_jMenu2MenuSelected
        // TODO add your handling code here:
        this.setVisible(false);
        new Create_Test().setVisible(true);
    }//GEN-LAST:event_jMenu2MenuSelected

    private void jMenu2MenuKeyPressed(javax.swing.event.MenuKeyEvent evt) {//GEN-FIRST:event_jMenu2MenuKeyPressed
        // TODO add your handling code here:
        this.setVisible(false);
        new Create_Test().setVisible(true);
    }//GEN-LAST:event_jMenu2MenuKeyPressed

    private void testURLKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_testURLKeyTyped
        // TODO add your handling code here:
        jTextField3.setText(testURL.getText() + "<Enter Test Folder Name>");
    }//GEN-LAST:event_testURLKeyTyped

    private void jTextField3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField3KeyTyped
        // TODO add your handling code here:
        filelist.setText(null);
        ArrayList<String> a = getTestFileNames();
        int b = a.size();
        for (int i = 0; i < b; i++) {
            String text = a.get(i);
            filelist.append(text + "\n");
        }
    }//GEN-LAST:event_jTextField3KeyTyped

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // TODO add your handling code here:
        long start = java.util.Calendar.getInstance().getTimeInMillis();

        String speed = null;
        String d = filelist.getText();
        String executelines[] = d.split(".js");
        System.out.println("Number of tests executing " + (executelines.length - 1));
        for (int i = 0; i < executelines.length - 1; i++) {
            String file = executelines[i];
            if (file.contains("Slow")) {
                speed = "slow";
                file = file.replaceAll("Slow:", "");
            } else {
                speed = "fast";
                file = file.replaceAll("Fast:", "");
            }
            file = file.replaceAll("\\s+", "");
            if (file != "") {
                System.out.println("filename: " + file);
                StringSelection stringSelection = new StringSelection(file);
                Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, stringSelection);
                try {
                    execute(file, speed);
                } catch (AWTException ex) {
                    Logger.getLogger(Run_Test.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else {
                System.out.println("Empty name");
            }
        }
        cleanup();
        long end = java.util.Calendar.getInstance().getTimeInMillis();
        long finaltime = end - start;
        long minutes = (int) ((finaltime / (1000 * 60)) % 60);
        System.out.println("\nTotal time taken for complete execution is: " + minutes + "mins");
        System.exit(0);
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jButton2MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Run_Test.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Run_Test.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Run_Test.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Run_Test.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Run_Test().setVisible(true);
            }
        });
    }

    public void execute(String file, String speed) throws AWTException {
        String filename = file;
        String testurl = testURL.getText();
        String resulturl = ResultURL.getText();
        System.out.println(testurl + " " + resulturl);

        //mPower main file source
        String testfileurl = testurl;
        String input1 = testfileurl + "main-mpower.js";
        String output1 = testfileurl + "main-mpower1.js";

        //Creating Results Folder
        File results = new File(resulturl + "MOCHA RESULTS");
        if (!results.exists()) {
            System.out.println("Creating Directory: " + results);
            boolean result = false;
            try {
                results.mkdir();
                result = true;
            } catch (SecurityException se) {
                //handle it
            }
            if (result) {
                System.out.println("Created Folder to store Results");
            }
        } else {
            System.out.println("Result Folder Exists");
        }
        //Comment Patterns
        String pattern1 = "/*AddFileHere*/";
        String line = "'../../test/mpower/" + filename + "'";
        try {
            converting(input1, output1, line, pattern1, speed);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public void converting(String input1, String output1, String line, String pattern1, String speed) throws IOException, InterruptedException, AWTException {
        // Create mocha test batches.
        int pos = 0, flag = 0;
        BufferedReader reader = new BufferedReader(new FileReader(input1));
        BufferedWriter writer = new BufferedWriter(new FileWriter(output1));
        System.out.println("\nAdding Test Cases at lines:");
        // Loop over lines in the file and write into new file.
        while (true) {
            String line1 = reader.readLine();

            if (line1 == null) {
                break;
            }
            pos++;
            //Replace Starting Pattern
            String pattern = pattern1;
            Pattern patternn = Pattern.compile(Pattern.quote(pattern));
            Matcher matcher2 = patternn.matcher(line1);
            while (matcher2.find()) {
                flag = pos;
                System.out.println(flag);
                line1 = line1.replace(pattern1, line);
            }

            writer.write(line1);
            writer.newLine();
        }
        writer.close();
        // Close the BufferedReader.
        reader.close();

        //Write back into original file
        BufferedReader reader1 = new BufferedReader(new FileReader(output1));
        BufferedWriter writer1 = new BufferedWriter(new FileWriter(input1));
        while (true) {
            String line1 = reader1.readLine();
            if (line1 == null) {
                break;
            }
            writer1.write(line1);
            writer1.newLine();
        }
        writer1.close();
        // Close the BufferedReader and Delete Duplicate File.
        reader1.close();
        File file = new File(output1);
        file.delete();

        //Firefox function to clear cache, run and save test cases
        runbrowser(speed);
        //Re-comment test suites
        recomment(input1, output1, pattern1, flag);
        return;
    }

    public static void recomment(String input1, String output1, String pattern1, int flag) throws IOException, InterruptedException {
        //Re-commenting code
        int pos = 0;
        BufferedReader reader2 = new BufferedReader(new FileReader(input1));
        BufferedWriter writer2 = new BufferedWriter(new FileWriter(output1));
        System.out.println("Removing Test Cases at lines:");
        // Loop over lines in the file and write into new file.
        while (true) {
            String line = reader2.readLine();

            if (line == null) {
                break;
            }
            pos++;
            //Replace Starting Comments
            if (pos == flag) {
                System.out.println(pos);
                line = pattern1;
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

    public void runbrowser(String speed) throws IOException, InterruptedException, AWTException {

        if (Firefox.isSelected()) {
            //Executing Test Cases
            System.out.println("Firefox is Selected");
            System.out.println("Opening Firefox and Executing Test Cases");
            Runtime.getRuntime().exec("C:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe http://localhost/GIT/147/ui/test/mpower.html");
            TimeUnit.SECONDS.sleep(3);
            //Clearing Cache
            Robot robot1;
            try {
                System.out.println("Clearing Cache");
                robot1 = new Robot();
                robot1.keyPress(KeyEvent.VK_F9);
                robot1.keyRelease(KeyEvent.VK_F9);
            } catch (AWTException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            TimeUnit.SECONDS.sleep(3);
            Runtime.getRuntime().exec("taskkill /F /IM firefox.exe");
            TimeUnit.SECONDS.sleep(2);

            //Executing Test Cases
            System.out.println("Executing Test Cases");
            Runtime.getRuntime().exec("C:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe http://localhost/GIT/147/ui/test/mpower.html");
            System.out.println("Running");
        } else if (Chrome.isSelected()) {
            //Executing Test Cases
            System.out.println("Chrome is Selected");
            System.out.println("Clearing Cache");
            System.out.println("Executing Test Cases");
            Runtime.getRuntime().exec("C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe http://localhost/GIT/147/ui/test/mpower.html");
            TimeUnit.SECONDS.sleep(2);
            //Clearing Cache
            Robot robot1;
            try {
                robot1 = new Robot();
                robot1.keyPress(KeyEvent.VK_SHIFT);
                robot1.keyPress(KeyEvent.VK_CONTROL);
                robot1.keyPress(KeyEvent.VK_R);
                robot1.keyRelease(KeyEvent.VK_SHIFT);
                robot1.keyRelease(KeyEvent.VK_CONTROL);
                robot1.keyRelease(KeyEvent.VK_R);
            } catch (AWTException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            TimeUnit.SECONDS.sleep(2);
        } else {
            System.out.println("No Browser Selected");
        }
        System.out.println("Running");

        //Saving testcase results
        if (speed == "slow") {
            TimeUnit.SECONDS.sleep(158);
        } else {
            TimeUnit.SECONDS.sleep(65);
        }
        System.out.println("Saving Results");
        TimeUnit.SECONDS.sleep(1);
        Robot robot;
        try {
            robot = new Robot();
            robot.keyPress(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_S);
            robot.keyRelease(KeyEvent.VK_S);
            robot.keyRelease(KeyEvent.VK_CONTROL);
            TimeUnit.SECONDS.sleep(3);
            robot.keyPress(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_V);
            robot.keyRelease(KeyEvent.VK_CONTROL);
            robot.keyRelease(KeyEvent.VK_V);
            TimeUnit.SECONDS.sleep(3);
            robot.keyPress(KeyEvent.VK_ENTER);
            robot.keyRelease(KeyEvent.VK_ENTER);
            TimeUnit.SECONDS.sleep(20);

        } catch (AWTException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        TimeUnit.SECONDS.sleep(2);
        //proc.waitFor();
        //Stopping Firefox /Chrome
        System.out.println("Completed");
        if (Firefox.isSelected()) {
            Runtime.getRuntime().exec("taskkill /F /IM firefox.exe");
        } else if (Chrome.isSelected()) {
            Runtime.getRuntime().exec("taskkill /F /IM chrome.exe");
        }
        System.out.println("Closed Browser");
    }

    public void cleanup() {
        String resulturl = ResultURL.getText();
        String resultfolder = resulturl + "MOCHA RESULTS";
        String zipfileloc = resulturl + "MOCHA_RESULTS.zip";
        System.out.println("\nResult: " + resultfolder + "\n");

        File deletefolder = new File(resultfolder);
        File deletedir = new File(resultfolder);
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
                addFileToZip(path + "/" + folder.getName(), srcFolder + "/" + fileName, zip);
            }
        }

    }
    //Deleting Result files from the folder

    static private void purgeFiles(File dir) {
        System.out.println("Deleting the Result Files");
        for (File file : dir.listFiles()) {
            System.out.println("Deleting: " + file);
            if (!file.isDirectory()) {
                boolean check = file.delete();
                if (check == true) {
                    System.out.println("Deleted");
                } else {
                    System.out.println("Delete Failed");
                }
            }
        }
    }
    //Deleting Result folders from the folder

    static void purgeDirectory(File dir) {
        for (File file : dir.listFiles()) {
            System.out.println("Deleting folder file: " + file);
            if (file.isDirectory()) {
                purgeDirectory(file);
            }
            file.delete();
        }
    }

    ArrayList<String> getTestFileNames() {
        String path = jTextField3.getText();
        File folder = new File(path);
        ArrayList<String> filename1 = new ArrayList<>();
        File[] listOfFiles = folder.listFiles();
        if (listOfFiles == null) {
            filename1.add("No Files");
        } else {
            for (File listOfFile : listOfFiles) {
                if (listOfFile.isFile()) {
                    String a = null;
                    if ((listOfFile.length() / 1024) > 62) {
                        a = "Slow: ".concat(listOfFile.getName());
                        filename1.add(a);
                    } else {
                        a = "Fast: ".concat(listOfFile.getName());
                        filename1.add(a);
                    }
                }
            }
        }
        return filename1;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox Chrome;
    private javax.swing.JCheckBox Firefox;
    private javax.swing.JCheckBox IE;
    private javax.swing.JTextField ResultURL;
    private javax.swing.JTextArea filelist;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField testURL;
    // End of variables declaration//GEN-END:variables
}