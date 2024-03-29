package com.zensar.currency.conversion;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

//@FeignClient(name = "Forx-Service1",url="localhost:8000")
@FeignClient(name = "Forx-Service1")
@RibbonClient(name = "Forx-Service1")
public interface CurrencyExchangeServiceProxy {
@GetMapping("/currency-exchange/from/{from}/to/{to}")
CurrencyConversionBean retrieveExchangeValue(@PathVariable("from") String from,@PathVariable("to") String to);

}
