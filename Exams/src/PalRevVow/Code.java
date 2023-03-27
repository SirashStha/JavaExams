package PalRevVow;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Code extends JFrame {
    JLabel label = new JLabel("Enter a String");
    JLabel outLabel = new JLabel("Output");
    JTextField textField = new JTextField(20);
    JTextField outTextField = new JTextField(20);
    JButton checkPalindrome = new JButton("Check Palindrome");
    JButton checkReverse = new JButton("Check Reverse");
    JButton findVowel = new JButton("Find Vowels");
    public Code() {

        add(label);
        add(textField);

        add(outLabel);
        add(outTextField);

        outTextField.setEditable(false);

        add(checkPalindrome);
        add(checkReverse);
        add(findVowel);

        String userInput = textField.getText();
        int length = userInput.length();

        checkPalindrome.addActionListener(e -> {
             String copyUserInput  = "";

             for(int i =length-1;i>=0;i++) {
                 copyUserInput = copyUserInput+userInput.charAt(i);
             }
             if (copyUserInput.equalsIgnoreCase(userInput)) {
                 outTextField.setText("String is palindrome");
             }
             else {
                 outTextField.setText("String is not palindrome");
             }
        });

        checkReverse.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String revUserInput = "";
                for (int i = length-1; i >=0;i--) {
                    revUserInput = revUserInput+userInput.charAt(i);
                }
                outTextField.setText("Reverse String is: "+revUserInput);
            }
        });

        findVowel.addActionListener(e-> {

            char[] vowel = {'a','e','i','o','u','A','E','I','O','U'};
            char[] extractedVowel = new char[length];
            String showVowel = "";
            for (int i =0; i<length; i++) {
                for (int j =0; j<vowel.length-1; j++) {
                    if(userInput.charAt(i) == vowel[j]) {
                        extractedVowel[i] = userInput.charAt(i);
                        showVowel += String.valueOf(extractedVowel[i]);
                    }
                }
            }
            outTextField.setText("Vowels: "+showVowel);
        });

        pack();

        setVisible(true);
        setSize(600,600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(4,1,10,20));
    }

    public static void main(String[] args) {
        new Code();
    }
}
