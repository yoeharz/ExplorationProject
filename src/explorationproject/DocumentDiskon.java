/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package explorationproject;

import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

/**
 *
 * @author acer
 */
public class DocumentDiskon extends PlainDocument{
    private int max;
    private static  final  long serialVersionUID = 1L;
    private int maxValue;

    public DocumentDiskon(int max, int maxValue) {
        this.max = max;
        this.maxValue = maxValue;
    }

    public DocumentDiskon() {
        this(-1, -1);
    }

    @Override
    public void insertString(int offs, String str, AttributeSet a) throws BadLocationException {
        int panjangYangMasuk = str.length();
        int panjangText = getLength();
        System.out.println(str + " : "+maxValue + " : "+offs+" : "+panjangYangMasuk+" : "+panjangText+":");
        
        if(str.matches("[0-9.]*") && (panjangText + panjangYangMasuk)<=this.max && new Integer(str) <= maxValue){
            super.insertString(offs, str, a);
            }else{

            }
    }
    

}
