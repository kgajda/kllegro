package pl.kllegro.web.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import pl.kllegro.model.Auction;
import pl.kllegro.model.SimpleAuction;
import pl.kllegro.service.AuctionService;

import java.util.List;

/**
 * Created by karol on 17.12.14.
 */
@RestController
@RequestMapping(value = "/rest/auction")
public class ActionsController {
    @Autowired
    private AuctionService auctionService;

    @RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public List<SimpleAuction> getAllAuction() {
        return auctionService.getAllSimpleAuction();
    }
    @RequestMapping( value = "/{id}",method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public Auction getAuction(@PathVariable String id) {
        return auctionService.getAuction(Long.valueOf(id));
    }

    @RequestMapping(method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public Long createNewAuction(@RequestBody Auction auction) {
        return auctionService.createNewAuction(auction);
    }

}
