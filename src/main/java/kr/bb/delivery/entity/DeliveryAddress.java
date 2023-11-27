package kr.bb.delivery.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import kr.bb.delivery.entity.common.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "delivery_address")
@NoArgsConstructor
@AllArgsConstructor
public class DeliveryAddress extends BaseEntity {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "delivery_address_id")
  private Long deliveryAddressId;

  @Column(name = "user_id", nullable = false)
  private Long userId;

  @Column(name = "delivery_recipient_name", nullable = false)
  private String deliveryRecipientName;

  @Column(name = "delivery_road_name", nullable = false)
  private String deliveryRoadName;

  @Column(name = "delivery_address_detail", nullable = false)
  private String deliveryAddressDetail;

  @Column(name = "delivery_zipcode", nullable = false)
  private String deliveryZipcode;

  @Column(name = "delivery_recipient_phone_number", nullable = false)
  private String deliveryRecipientPhoneNumber;
}