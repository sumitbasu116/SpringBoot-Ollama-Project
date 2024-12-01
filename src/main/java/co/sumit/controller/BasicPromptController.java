package co.sumit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import co.sumit.service.OllamaAIService;

@RestController
public class BasicPromptController {

	@Autowired
	private OllamaAIService ollamaAIService;
	@GetMapping("/api/v1/generate")
	public String generate(@RequestParam(value = "prompt") String promptMessage) {
		return ollamaAIService.generateResult(promptMessage);
	}
}
