package com.klef.jfsd.exam;

import com.klef.jfsd.exam.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CommentController {

    @Autowired
    private CommentService commentService;

    @GetMapping("/comments")
    public String getAllComments() {
        return commentService.fetchAllComments();
    }
    
    
}
