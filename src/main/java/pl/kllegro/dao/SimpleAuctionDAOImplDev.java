package pl.kllegro.dao;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Repository;
import pl.kllegro.model.Product;
import pl.kllegro.model.SimpleAuction;

import java.math.BigDecimal;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by karol on 19.12.14.
 */
@Profile("dev")
@Repository
public class SimpleAuctionDAOImplDev implements SimpleAuctionDAO {
    @Override
    public List<SimpleAuction> getSimpleAuction() {
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
