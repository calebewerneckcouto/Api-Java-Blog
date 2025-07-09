package com.cwcdev.blog.controller;

import com.cwcdev.blog.model.Blog;
import com.cwcdev.blog.repository.BlogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(origins = {"http://localhost:5173", "https://cwc3d.net"})
@RequestMapping("/api/blogs")
public class BlogController {

    @Autowired
    private BlogRepository blogRepository;

    @GetMapping
    public List<Blog> getAllBlogs() {
        return blogRepository.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Blog> getBlogById(@PathVariable Long id) {
        Optional<Blog> blog = blogRepository.findById(id);
        return blog.map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public Blog createBlog(@RequestBody Blog blog) {
        return blogRepository.save(blog);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Blog> updateBlog(@PathVariable Long id, @RequestBody Blog blogDetails) {
        Optional<Blog> optionalBlog = blogRepository.findById(id);
        if (optionalBlog.isPresent()) {
            Blog blog = optionalBlog.get();
            blog.setTitle(blogDetails.getTitle());
            blog.setBody(blogDetails.getBody());
            return ResponseEntity.ok(blogRepository.save(blog));
        }
        return ResponseEntity.notFound().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteBlog(@PathVariable Long id) {
        if (blogRepository.existsById(id)) {
            blogRepository.deleteById(id);
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.notFound().build();
    }
}
