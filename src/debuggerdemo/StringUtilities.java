/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package debuggerdemo;

/**
 *
 * @author rio197
 */
public class StringUtilities {
    private StringBuilder sBuilder = new StringBuilder();
    private int charsAdded = 0;
    
    public void addChar(StringBuilder sBuilder, char c) {
        sBuilder.append(c);
        charsAdded++;
    }
}
