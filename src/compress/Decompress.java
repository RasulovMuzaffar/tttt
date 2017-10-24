/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compress;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import org.apache.commons.compress.compressors.xz.XZCompressorInputStream;

/**
 *
 * @author User
 */
public class Decompress {

    static String unCompressXZ(String fileName) throws IOException {
        InputStream fin = Files.newInputStream(Paths.get("c:\\testFolder\\dfolder\\" + fileName));
        BufferedInputStream in = new BufferedInputStream(fin);
        OutputStream out = Files.newOutputStream(Paths.get("c:\\testFolder\\dfolder\\" + fileName.substring(0, fileName.length() - 3)));
        XZCompressorInputStream xzIn = new XZCompressorInputStream(in);
        final byte[] buffer = new byte[1024];
        int n = 0;
        while (-1 != (n = xzIn.read(buffer))) {
            out.write(buffer, 0, n);
        }
        out.close();
        xzIn.close();
        return fileName.substring(0, fileName.length() - 3);
    }
}
