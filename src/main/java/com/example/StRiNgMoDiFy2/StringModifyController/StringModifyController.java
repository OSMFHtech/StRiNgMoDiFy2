package com.example.StRiNgMoDiFy2.StringModifyController;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/modify")
public class StringModifyController {

    @GetMapping("/length")
    public int getLastModifiedStringLength() {
        return StringModifier.getLastModifiedStringLength();
    }

    @GetMapping
    public String modifyString(@RequestParam("string") String input) {
        return StringModifier.modifyString(input);
    }
}
