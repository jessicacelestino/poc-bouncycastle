package br.com.pgp;

import org.bouncycastle.openpgp.PGPException;

import java.io.IOException;
import java.security.NoSuchProviderException;

public class PGPMain {

    public static void main(String[] args) throws IOException, PGPException, NoSuchProviderException {

        String outputFileName = "";
        String inputFileName = "";
        String publicKeyFileName = "";
        String privateKeyFileName = "";

        KeyBasedFileProcessor.encryptFileWithStream(outputFileName, inputFileName, publicKeyFileName, true, true);
        KeyBasedFileProcessor.decryptFileWithStream(outputFileName, privateKeyFileName,  inputFileName);
    }
}
