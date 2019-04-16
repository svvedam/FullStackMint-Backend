package com.mint.backend.mint.Controllers;

import com.mint.backend.mint.Entity.Category;
import com.mint.backend.mint.Service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
@CrossOrigin("*")
@RestController
public class CategoryController {
    @Autowired
    private CategoryService categoryService;


    @PostMapping("/categories/")
    public ResponseEntity<Category> create(@RequestBody Category category) {

        Category returnCategory = categoryService.createCategory(category);
        return (returnCategory == null) ? (new ResponseEntity<>(HttpStatus.BAD_REQUEST))
                : new ResponseEntity<>(returnCategory,HttpStatus.CREATED);
    }

//    @GetMapping("/videos/comment/{user_id}/{video_id}")//videos/comment/1/2
//    public ResponseEntity<Set<Comment>> show(@PathVariable Long id) {
//        return new ResponseEntity<>(HttpStatus.OK);
//    }
//
//    @PutMapping("videos/comment/{id}")
//    public ResponseEntity<Video> updateComment(@PathVariable Long id, @RequestBody Comment comment) {
//        return new ResponseEntity<>( HttpStatus.OK);
//    }
//
//    @DeleteMapping("videos/comment/{id}")
//    @ResponseStatus(value = HttpStatus.NO_CONTENT)
//    public void DeleteComment(@PathVariable Long id) {
//    }
}
