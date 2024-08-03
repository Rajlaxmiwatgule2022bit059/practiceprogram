import java.awt.*;
import java.awt.event.*;
import java.io.File;

class Mee extends Frame implements ActionListener {
    Button a;
    TextField t1, t2;
    Label l1, l2;
    static int jcount;
    static int tcount;
    String path = "/home/rajlaxmi/Desktop/programing/JAVA";

    Mee() {
        setLayout(new FlowLayout());
        l1 = new Label("Number of java files : ");
        t1 = new TextField(20);
        l2 = new Label("Number of text files : ");
        t2 = new TextField(20);
        a = new Button("ok");

        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(a);

        a.addActionListener(this);
        
        // Add window closing functionality
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

    public void actionPerformed(ActionEvent ae) {
        jcount = 0;
        tcount = 0;
        // Create a file object with the given path
        File directory = new File(path);
        // Create an array of filesList using the .listFiles() method of file object
        File[] filesList = directory.listFiles();

        // Check if list is not null otherwise terminate the program
        if (filesList != null) {
            // Iterate through each file object in the array
            for (File file : filesList) {
                if (file.isFile()) {
                    if (file.toString().endsWith(".java")) {
                        jcount++;
                    } else if (file.toString().endsWith(".txt")) {
                        tcount++;
                    }
                }
            }
        }

        // Set the counts to the text fields
        t1.setText(String.valueOf(jcount));
        t2.setText(String.valueOf(tcount));
    }

    public static void main(String args[]) {
        Mee m = new Mee();
        m.setTitle("Location Explorer");
        m.setSize(400, 300);
        m.setVisible(true);
    }
}

