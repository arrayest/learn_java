package org.example.crack;

import cn.hutool.core.io.FileUtil;
import cn.hutool.core.util.HexUtil;

public class SublimeTextCrack {
    public static void main(String[] args) {
        byte[] bytes = FileUtil.readBytes("C:\\Program Files\\Sublime Text\\sublime_text.exe");
        String hex = HexUtil.encodeHexStr(bytes, true);

        String tag1 = "e893 5820 0049 8b96 b802 0000 488d 0d5d 0c00 0041 b898 3a00 00e8 7a58 2000".replaceAll(" ", "");
        String rep1 = "9090 9090 9049 8b96 b802 0000 488d 0d5d 0c00 0041 b898 3a00 0090 9090 9090".replaceAll(" ", "");

        String tag2 = "e424 0000 5541 5741 5641 5541".replaceAll(" ", "");
        String rep2 = "e424 0000 4831 c0c3 5641 5541".replaceAll(" ", "");

        String tag3 = "5556 5748 83ec 3048 8d6c 2430 48c7 45f8 feff ffff 89d6 4889 cf6a 28".replaceAll(" ", "");
        String rep3 = "4831 c048 ffc0 c348 8d6c 2430 48c7 45f8 feff ffff 89d6 4889 cf6a 28".replaceAll(" ", "");
        hex = hex.replaceAll(tag1, rep1)
                .replaceAll(tag2, rep2)
                .replaceAll(tag3, rep3);
        bytes = HexUtil.decodeHex(hex);
        FileUtil.writeBytes(bytes, "D:\\sublime_text.exe");
    }
}