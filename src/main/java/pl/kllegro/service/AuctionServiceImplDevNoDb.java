package pl.kllegro.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import pl.kllegro.model.SimpleAuction;

import java.math.BigDecimal;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by karol on 17.12.14.
 */
@Profile("dev_no_db")
@Service
public class AuctionServiceImplDevNoDb implements AuctionService {
    @Override
    public List<SimpleAuction> getAllAuction() {
        List<SimpleAuction> simpleAuctions = new LinkedList<>();
        simpleAuctions.add(new SimpleAuction(1,new Date(),"temat","http://cdns2.freepik.com/darmowe-zdjecie/zrob-zdj%C4%99cie--antyki--ramka--zdj%C4%99cie_3303577.jpg",new BigDecimal(20)));
        simpleAuctions.add(new SimpleAuction(1,new Date(),"temat","http://cdns2.freepik.com/darmowe-zdjecie/zrob-zdj%C4%99cie--antyki--ramka--zdj%C4%99cie_3303577.jpg",new BigDecimal(20)));
        simpleAuctions.add(new SimpleAuction(1,new Date(),"temat","http://cdns2.freepik.com/darmowe-zdjecie/zrob-zdj%C4%99cie--antyki--ramka--zdj%C4%99cie_3303577.jpg",new BigDecimal(20)));
        simpleAuctions.add(new SimpleAuction(1,new Date(),"temat","http://cdns2.freepik.com/darmowe-zdjecie/zrob-zdj%C4%99cie--antyki--ramka--zdj%C4%99cie_3303577.jpg",new BigDecimal(20)));
        simpleAuctions.add(new SimpleAuction(1,new Date(),"temat","http://cdns2.freepik.com/darmowe-zdjecie/zrob-zdj%C4%99cie--antyki--ramka--zdj%C4%99cie_3303577.jpg",new BigDecimal(20)));
        simpleAuctions.add(new SimpleAuction(1,new Date(),"temat","http://cdns2.freepik.com/darmowe-zdjecie/zrob-zdj%C4%99cie--antyki--ramka--zdj%C4%99cie_3303577.jpg",new BigDecimal(20)));
        simpleAuctions.add(new SimpleAuction(1,new Date(),"temat","http://cdns2.freepik.com/darmowe-zdjecie/zrob-zdj%C4%99cie--antyki--ramka--zdj%C4%99cie_3303577.jpg",new BigDecimal(20)));
        simpleAuctions.add(new SimpleAuction(1,new Date(),"temat","http://cdns2.freepik.com/darmowe-zdjecie/zrob-zdj%C4%99cie--antyki--ramka--zdj%C4%99cie_3303577.jpg",new BigDecimal(20)));
        simpleAuctions.add(new SimpleAuction(1,new Date(),"temat","http://cdns2.freepik.com/darmowe-zdjecie/zrob-zdj%C4%99cie--antyki--ramka--zdj%C4%99cie_3303577.jpg",new BigDecimal(20)));
        simpleAuctions.add(new SimpleAuction(1,new Date(),"temat","http://cdns2.freepik.com/darmowe-zdjecie/zrob-zdj%C4%99cie--antyki--ramka--zdj%C4%99cie_3303577.jpg",new BigDecimal(20)));
        return simpleAuctions;
    }
}
