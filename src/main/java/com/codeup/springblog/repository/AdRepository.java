//package com.codeup.springblog.repository;
//
//import com.codeup.springblog.models.Ad;
//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Query;
//
//import java.util.List;
//
//public interface AdRepository extends JpaRepository<Ad,Long> {
//
//    //examples of derived queries.
//    Ad findByTitle(String title);
//    List<Ad> findByOrderByTitle();
//    //examples of JPQL/HQL
//    @Query("from Ad a where a.id like ?1 AND ?2")
//    Ad getAdById(long id);
//
//    @Query("select title from Ad where LENGTH(title) <15")
//    List<String> getAdsOfCertainTitleLength();
//
//    @Query(nativeQuery = true, value = "SELECT title FROM ads WHERE LENGTH(title)< 10")
//    List<String> getAdsNativeQuery();
//}
