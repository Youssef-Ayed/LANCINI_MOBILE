/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codecrafters.lancini.tools;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.codename1.system.NativeInterface;

/**
 *
 * @author shannah
 */
public interface FileChooserNative extends NativeInterface {
    public boolean showNativeChooser(String accept, boolean multi);
}
