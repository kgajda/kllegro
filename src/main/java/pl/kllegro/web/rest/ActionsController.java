package pl.kllegro.web.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.kllegro.model.Auction;
import pl.kllegro.service.AuctionService;

import java.util.List;

/**
 * Created by karol on 17.12.14.
 */
@RestController
@RequestMapping(value = "/auction")
public class ActionsController {
    @Autowired
    private AuctionService auctionService;

    public List<Auction> getAllAuction() {
        return auctionService.getAllAuction();
    }


}
