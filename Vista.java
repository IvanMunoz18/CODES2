
package programa1;
import java .awt. BorderLayout ;
import java .awt. FlowLayout ;
import java .awt. GridLayout ;
import javax . swing . JFrame ;
import javax . swing . JTextField ;
import javax . swing . JTextArea ;
import javax . swing . JComboBox ;
import javax . swing . JButton ;
import javax . swing . JLabel ;
import javax . swing . JScrollPane ;
import javax . swing . JPanel ;
public class Vista extends JFrame implements InterfazVista
{
private final JTextArea text ; 
private final JButton encryptJButton ;
private final JButton decryptJButton ;
private final JButton saveJButton ;

private final JTextField fileName ; 
public Vista () {
JPanel fileJPanel ;
JLabel lblFile ;
JPanel buttonJPanel ;
BorderLayout layout ;
//super (" Testing cipher ") ;
layout = new BorderLayout (20 , 10) ;
setLayout ( layout ) ;
fileJPanel = new JPanel () ;
fileJPanel . setLayout (new FlowLayout () ) ;
lblFile = new JLabel ( " Archivo de texto / cifrado :" ) ;
lblFile . setToolTipText ( " Archivo a abrir " ) ;
fileJPanel .add( lblFile ) ;
fileName = new JTextField (20) ;
fileJPanel .add( fileName ) ;
add ( fileJPanel , BorderLayout . NORTH ) ;
text = new JTextArea (10 ,15) ;
add (new JScrollPane ( text ) , BorderLayout . CENTER ) ;
buttonJPanel = new JPanel () ;
buttonJPanel . setLayout ( new GridLayout (4 , 1) ) ;

encryptJButton = new JButton ( Encrypt ) ;
buttonJPanel .add( encryptJButton ) ;
decryptJButton = new JButton ( Decrypt ) ;
buttonJPanel .add( decryptJButton ) ;
saveJButton = new JButton ( Save ) ;
buttonJPanel .add( saveJButton ) ;
add ( buttonJPanel , BorderLayout . EAST ) ;
}
public String getFileName () { return fileName . getText () ; }
public String getText () { return text . getText () ; }
public void setText ( String s) { text . setText (s) ; }
public void setControlador ( Controlador c) {
saveJButton . addActionListener (c) ;
encryptJButton . addActionListener (c) ;
decryptJButton . addActionListener (c) ;
}

    @Override
    public void setController(Controller c) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}