package pl.kllegro.web.rest;

import javassist.tools.web.BadHttpRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import pl.kllegro.exceptions.DepositsOfferException;
import pl.kllegro.model.Offer;
import pl.kllegro.service.OfferService;

/**
 * Created by karol on 22.12.14.
 */
@RestController
@RequestMapping(value = "newOffer")
public class OfferController {
    @Autowired
    private OfferService offerService;

    @RequestMapping(value = "/{id}", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public Long getAuction(@PathVariable String id,@RequestBody Offer offer) throws BadHttpRequest {
        try {
            return offerService.createNewOffer(Long.valueOf(id),offer);
        } catch (DepositsOfferException e) {
            throw new BadHttpRequest(e);
        }
    }
}
