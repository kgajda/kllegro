package pl.kllegro.web.rest;

import javassist.tools.web.BadHttpRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import pl.kllegro.exceptions.DepositsOfferException;
import pl.kllegro.model.Offer;
import pl.kllegro.service.OfferService;

import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * Created by karol on 22.12.14.
 */
@RestController
public class OfferController {
    @Autowired
    private OfferService offerService;

    @RequestMapping(value = "newoffer/{id}", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public Long newOffer(@PathVariable String id, @RequestBody Offer offer, HttpSession httpSession) throws BadHttpRequest {
        try {
            offer.getUser().setName((String) httpSession.getAttribute("userName"));
            return offerService.createNewOffer(Long.valueOf(id), offer);
        } catch (DepositsOfferException e) {
            throw new BadHttpRequest(e);
        }
    }

    @RequestMapping(value = "offer/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Offer> getHistoryOffer(@PathVariable String id) throws BadHttpRequest {
        return offerService.getHistoryOffer(Long.valueOf(id));
    }
}
