import java.awt.print.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class PrintDoc implements Printable, ActionListener
{
	public static void main(String args[])
	{
		UIManager.put("swing.boldMetal", Boolean.FALSE);
        	JFrame f = new JFrame("Hello World Printer");
        	f.addWindowListener(new WindowAdapter() {
           	public void windowClosing(WindowEvent e) {System.exit(0);}
        	});
        	JButton printButton = new JButton("Print Hello World");
        	printButton.addActionListener(new PrintDoc());
        	f.add("Center", printButton);
        	f.pack();
        	f.setVisible(true);
	}

	public void actionPerformed(ActionEvent e) 
	{
        	PrinterJob job = PrinterJob.getPrinterJob();
         	job.setPrintable(this);
         	boolean ok = job.printDialog();
         	if (ok) 
		{
             		try 
			{
                  		job.print();
             		} 
			catch (PrinterException ex) 
			{
        		      /* The job did not successfully complete */
             		}
         	}
    	}

	public int print(Graphics g, PageFormat pf, int page)
	{
		if(page>0)
			return NO_SUCH_PAGE;
		Graphics2D g2d = (Graphics2D)g;
	    	g2d.translate(pf.getImageableX(), pf.getImageableY());

    // Now we perform our rendering
		StringBuilder nm = new StringBuilder("Sohil");
		nm.append(" Sundaram SOhil ...");
    		g.drawString(nm, 100, 100);

    // tell the caller that this page is part
    // of the printed document
    		return PAGE_EXISTS;

	}
}