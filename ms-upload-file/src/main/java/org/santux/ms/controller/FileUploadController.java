package org.santux.ms.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("file-upload")
public class FileUploadController {

  @GetMapping("/hello")
  public String hello() {
    return "Hello, World";
  }

  @PostMapping("upload")
  public String fileUpload(@RequestParam("file")MultipartFile file) {
    return file.getOriginalFilename();
  }
}
