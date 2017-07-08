package io.rsocket.cli.util;

import io.rsocket.cli.UsageException;
import java.io.File;

public class FileUtil {
  public static File expectedFile(String name) {
    File file = new File(normalize(name));

    if (!file.isFile()) {
      throw new UsageException("setup file not found: " + file);
    }
    return file;
  }

  private static String normalize(String path) {
    if (path.startsWith("~/")) {
      return System.getenv("HOME") + "/" + path.substring(2);
    } else {
      return path;
    }
  }
}
