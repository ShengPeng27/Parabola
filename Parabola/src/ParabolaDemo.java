
import javax.swing.JFrame;


/**
 * @author Sheng
 * Draw a parabola in JFrame, the function of this parabola is 
 * y=x^2
 *
 */
public class ParabolaDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parabola frame= new Parabola("Parabola");
		
		frame.setVisible(true);
		frame.setSize(500,500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		Parabola.GraphPanel g= new Parabola.GraphPanel();
		frame.add(g);
	}

}
