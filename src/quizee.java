
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 *
 * @author olade
 */
public class quizee extends javax.swing.JFrame  {

    private javax.swing.JButton CheckAnswerBtn;
    private javax.swing.JLabel GraphicsjLabel;
    private javax.swing.JButton NextQuestionBtn;
    private javax.swing.JLabel QuestionjLabel;
    private javax.swing.JButton QuitBtn;
    private javax.swing.JLabel ScorejLabel;
    private javax.swing.JComboBox<String> SelectAnswerComboBox;
    private javax.swing.JLabel SelectAnswerjLabel;
    private javax.swing.JButton StartBtn;
    private javax.swing.JTextField answerchoiceTextField;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel questionTextField;



    /**
     * Creates new form quizee
     */
    
    
    public quizee() {
        initComponents();
        iniData();
        update();
        
        NextQuestionBtn.setEnabled(true);
        //CheckAnswerBtn.setEnabled(false);
      

        GraphicsjLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Thumbs-up.jpg")));

    }

    public void update() {
       
      //  questionTextField.setText("The day of the week that Starts with M is what?");
        //    ScorejLabel.setText(" " + score); // this add to the score in the quiz.
    }//this does nothing it just updates the values in the GUI and changes the texts on the text buttions.

    public void iniData() {

    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    public void initComponents() {
        //questions
        String ques[]={"What is the Capital Of Australia?","Who scored the final goal of the Euro 2012 Championships",
        "Which of these are not a county in Ireland","Who won the Premier League in 2019/2020","What is the Capital of Nigeria",
        "Which of these is not a city in USA","Which is the hottest planet", "Where is the Eiffel Tower Located in",
        "Who is the Prime Minister Of Ireland","Who is the President of the United States"};



        //answers

        String answers[][] = {{"Perth", "Canberra","Adelaide","Sydney"},{"David Silva","Juan Mata","Cristiano Ronaldo","Antonio Di Natalie"}
        ,{"Limerick", "Dublin", "Manchester", "Cork"},{"Manchester City", "Manchester United", "Liverpool", "Chelsea"} ,
                {"Lagos","Port-Harcourt","Abuja","Calabar"}, {"Warri", "New York", "Chicago", "Los Angeles"},
                {"Venus", "Mercury", "Saturn", "Earth"}, {"Madrid", "London", "Orlando","Paris"},
                {"Michael Martin", "Mohammed Buhari", "Prince Charles", "Boris Johnson"},
                {"Barack Obama", "The Rock", "Donald Trump", "Hillary CLinton"}
        };

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        QuestionjLabel = new javax.swing.JLabel();
        SelectAnswerjLabel = new javax.swing.JLabel();
        questionTextField = new javax.swing.JLabel();
        SelectAnswerComboBox = new javax.swing.JComboBox<>();
        answerchoiceTextField = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        StartBtn = new javax.swing.JButton();
        NextQuestionBtn = new javax.swing.JButton();
        CheckAnswerBtn = new javax.swing.JButton();
        QuitBtn = new javax.swing.JButton();
        GraphicsjLabel = new javax.swing.JLabel();
        ScorejLabel = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("General knowledge Quiz");

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Quiz"));

        QuestionjLabel.setText("Question");

        SelectAnswerjLabel.setText("Select Answer");

        questionTextField = new JLabel(ques[0]);
        //questionTextField.addActionListener(new java.awt.event.ActionListener() {
            //public void actionPerformed(java.awt.event.ActionEvent evt) {
           //     questionTextFieldActionPerformed(evt);
         //   }
       // });

        SelectAnswerComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(answers[0]));
        SelectAnswerComboBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                SelectAnswerComboBoxItemStateChanged(evt);
            }
        });
        SelectAnswerComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SelectAnswerComboBoxActionPerformed(evt);
            }
        });

        answerchoiceTextField.setEditable(false);
        answerchoiceTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                answerchoiceTextFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(SelectAnswerjLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE)
                    .addComponent(QuestionjLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(questionTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 382, Short.MAX_VALUE)
                    .addComponent(SelectAnswerComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(answerchoiceTextField))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(QuestionjLabel)
                    .addComponent(questionTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SelectAnswerComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SelectAnswerjLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(answerchoiceTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Controls", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.ABOVE_TOP));

        StartBtn.setText("Start");
        StartBtn.setToolTipText("click on the start button to start");
        StartBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StartBtnActionPerformed(evt);
            }
        });
        StartBtn.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                StartBtnKeyPressed(evt);
            }
        });

        NextQuestionBtn.setText("Next Question");
        NextQuestionBtn.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                NextQuestionBtnKeyReleased(evt);
            }
        });



        NextQuestionBtn.addActionListener(new ActionListener() {


            
            int ctr = 0;
            @Override
            public void actionPerformed(ActionEvent e) {
                ctr++;
                if(ctr<ques.length){

                    questionTextField.setText(ques[ctr]);

                    SelectAnswerComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(answers[ctr]));


                    while(ctr == 5){

                        JOptionPane.showMessageDialog(null, "<html><br>Thanks for Taking the quiz.<br> Number of " +
                                "questions answered =" +ctr+"<br> Number of Correct answers =   </html>");


                    }
                }



            }
        });

        CheckAnswerBtn.setText("Check Answer");
        CheckAnswerBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckAnswerBtnActionPerformed(evt);
            }
        });

        QuitBtn.setText("Quit");
        QuitBtn.setToolTipText("Click to quit and finish");
        QuitBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                QuitBtnMouseClicked(evt);
            }
        });
        QuitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QuitBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(228, Short.MAX_VALUE)
                .addComponent(StartBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(NextQuestionBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(CheckAnswerBtn)
                .addGap(29, 29, 29)
                .addComponent(QuitBtn)
                .addGap(83, 83, 83))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(76, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(StartBtn)
                    .addComponent(NextQuestionBtn)
                    .addComponent(CheckAnswerBtn)
                    .addComponent(QuitBtn))
                .addContainerGap())
        );

        ScorejLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ScorejLabel.setText("Score :");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(ScorejLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(111, 111, 111)
                        .addComponent(GraphicsjLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ScorejLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(GraphicsjLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE)
                        .addGap(30, 30, 30)))
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SelectAnswerComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SelectAnswerComboBoxActionPerformed


    }//GEN-LAST:event_SelectAnswerComboBoxActionPerformed

    private void QuitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QuitBtnActionPerformed
        // TODO add your handling code here:
       int response = JOptionPane.showConfirmDialog(this, "Do you wish to quit? " , "Confirm",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE ); 
       
       if (response==JOptionPane.YES_OPTION){
         //if yes option selected ..
       //    System.out.println("Yes option selected"+ "\n"+ "Thanks for taking the quiz " + "\n"+ "Number of questions = 5 " + "\n"+ "Number of correct answer = 2 " + "\n" + "Number of incorrect answers = 3" + "\n" + "Percentage success Rate 40.0%");
      System.exit(0);
       }
       else if(response==JOptionPane.NO_OPTION){
           
       }

    }//GEN-LAST:event_QuitBtnActionPerformed

    private void StartBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StartBtnActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, "You've started");
    }//GEN-LAST:event_StartBtnActionPerformed

    private void questionTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_questionTextFieldActionPerformed
        // TODO add your handling code here:
        

    }//GEN-LAST:event_questionTextFieldActionPerformed

    private void SelectAnswerComboBoxItemStateChanged(java.awt.event.ItemEvent evt) {
//GEN-FIRST:event_SelectAnswerComboBoxItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_SelectAnswerComboBoxItemStateChanged

    private void QuitBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_QuitBtnMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_QuitBtnMouseClicked

    private void answerchoiceTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_answerchoiceTextFieldActionPerformed


    }//GEN-LAST:event_answerchoiceTextFieldActionPerformed

    private void CheckAnswerBtnActionPerformed(java.awt.event.ActionEvent evt) {
        float correctanswer = 0;
        float wronganswers = 0;

       // String[] answers = {"Canberra","Juan Mata", "Manchester", "Liverpool", "Abuja", "Warri", "Venus", "Paris", "Michael Martin", "Donald Trump"};
        if(SelectAnswerComboBox.getSelectedItem() == "Canberra" || SelectAnswerComboBox.getSelectedItem() == "Juan Mata" ||
                SelectAnswerComboBox.getSelectedItem() == "Manchester" ||
                SelectAnswerComboBox.getSelectedItem() == "Liverpool" || SelectAnswerComboBox.getSelectedItem() == "Abuja" ||
                SelectAnswerComboBox.getSelectedItem() == "Warri" || SelectAnswerComboBox.getSelectedItem() == "Venus" ||
                SelectAnswerComboBox.getSelectedItem() == "Paris" || SelectAnswerComboBox.getSelectedItem() == "Michael Martin" ||
                SelectAnswerComboBox.getSelectedItem() == "Donald Trump" ){

            correctanswer++;
           // JOptionPane.showMessageDialog(null, "Correct Answer");

            answerchoiceTextField.setText("Correct Answer !!");

        }

        else{
            wronganswers++;
            //JOptionPane.showMessageDialog(null, "Wrong Answer pls try again");
            answerchoiceTextField.setText("Wrong Answer !!");
        }


    }

    private void NextQuestionBtnKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_NextQuestionBtnKeyReleased

      
    }//GEN-LAST:event_NextQuestionBtnKeyReleased

    private void StartBtnKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_StartBtnKeyPressed
        // TODO add your handling code here:
          if (StartBtn.getText().length()>0) {


            NextQuestionBtn.setEnabled(true);

        }else{

            NextQuestionBtn.setEnabled(false);

        }
    }//GEN-LAST:event_StartBtnKeyPressed


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
            java.util.logging.Logger.getLogger(quizee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(quizee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(quizee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(quizee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new quizee().setVisible(true);
            }
        });
    }




}
