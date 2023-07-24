package com.example.insuranceapplication.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.example.insuranceapplication.entity.Plan;
import com.example.insuranceapplication.entity.SearchRequest;
import com.example.insuranceapplication.entity.Subscriber;
import com.example.insuranceapplication.service.PlanService;
import com.example.insuranceapplication.service.SearchRequestService;
import com.example.insuranceapplication.service.SubscriberService;

@Controller
public class MainController {
	
	@Autowired
	SearchRequestService searchRequestService;
	
	@Autowired
	SubscriberService subscriberService;
	
	@Autowired
	PlanService planService;
	
	@RequestMapping("/")
	public ModelAndView search(Model model, RedirectAttributes redirectAttributes) {
		SearchRequest searchRequest = new SearchRequest();
		model.addAttribute("searchRequest", searchRequest);
		model.addAttribute("searchType", searchRequest.getSearchType());
		model.addAttribute("inputText", searchRequest.getInputText());
		redirectAttributes.addAttribute("inputText", searchRequest.getInputText());
		return new ModelAndView("search", "searchRequest", new SearchRequest());
	}
	
	
	@PostMapping("/processSearch")
	public String processSearch(Model model, @ModelAttribute("searchRequest") SearchRequest searchRequest) {
		List<Subscriber> subscribers = searchRequestService.getSubscribers(searchRequest);
		model.addAttribute("subscribers", subscribers);
		return "search-results";
	}
	
	@RequestMapping("/plan/{id}")
	public String viewPlan(Model model, @PathVariable("id") int id) {
	    Plan plan = planService.getPlan(id);
	    model.addAttribute("plan", plan);
	    return "plan";
	}


}
