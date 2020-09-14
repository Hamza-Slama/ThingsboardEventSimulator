package org.thingsboard.controller;


import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.async.DeferredResult;
import org.thingsboard.publisher.EventType;
import org.thingsboard.service.GatewaySimulatorService;

@Slf4j
@RestController
@RequestMapping(value = "/api/gateway")
public class GatewaySimulatorController {

    @Autowired
    GatewaySimulatorService gatewaySimulatorService;

    @ApiOperation(value = "Push Events to thingsboard", response = String.class)
    @PostMapping("/events/{eventType}/")

    public DeferredResult<ResponseEntity> pushTelemetry(@PathVariable("eventType") EventType eventType,
                                                        @RequestParam(name = "gatewayToken") String gatewayToken,
                                                        @RequestParam(name = "deviceName") String deviceName) {
        final DeferredResult<ResponseEntity> deferredResult = new DeferredResult<>();
        deferredResult.setResult(new ResponseEntity(HttpStatus.OK));
        gatewaySimulatorService.pushEvents( eventType.name(), gatewayToken, deviceName);
        return deferredResult;
    }
}
