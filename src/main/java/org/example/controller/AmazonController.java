package org.example.controller;


import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Controller
@RestController
public class AmazonController {

  @GetMapping(value = "/info")
  public ResponseEntity<Object> getInformation(){

    Map<String, Object> responseData = new HashMap<>();
    responseData.put("status", "200");
    responseData.put("message", "prosecced data success");
    responseData.put("data", getDtaList());
    return ResponseEntity.ok(responseData);
  }

  private List<String> getDtaList(){
    return List.of("elmer", "melissa", "maritza", "clemenacia", "huaraz");
  }
}
