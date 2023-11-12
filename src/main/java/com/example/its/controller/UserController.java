package com.example.its.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.its.service.UserService;

import lombok.RequiredArgsConstructor;

@Controller
@RequestMapping("/users")
@RequiredArgsConstructor
public class UserController {
	
	private final UserService userService;
	
	@GetMapping
	public String showList(Model model) {
		model.addAttribute("userList", userService.findAll());
		return "users/List";
	}
	
	@GetMapping("/createForm)@")
	public String showCleateForm() {
		return "users/creationForm";
	}
	
//    @PostMapping
//    public String create(@Validated IssueForm form, BindingResult bindingResult, Model model) {
//        if (bindingResult.hasErrors()) {
//            return showCreationForm(form);
//        }
//        issueService.create(form.getSummary(), form.getDescription());
//        return "redirect:/issues";
//    }
//
//    @GetMapping("/{issueId}")
//    public String showDetail(@PathVariable("issueId") long issueId, Model model) {
//        model.addAttribute("issue", issueService.findById(issueId));
//        return "issues/detail";
//    }
	
}
