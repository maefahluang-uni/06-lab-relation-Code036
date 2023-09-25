package th.mfu;

import java.util.List;

import org.apache.tomcat.jni.Address;
import org.springframework.data.repository.CrudRepository;

import th.mfu.domain.Seat;

public interface SeatRepository extends CrudRepository<Seat, Long> {
    public List<Seat> findByConcertId(long concertId);

    public void deleteByConcertId(long id);
}
