public interface DeliveryChargeCaluculator {

    default int getDeliveryCharge(double weight, int price){
        int deliveryCharge = 2500;

        if(price < 30000){
            //3만원 미만 무게단위 배송비 적용
            if(weight < 3){
                deliveryCharge = 1000;
            }else if(3 <= weight && weight < 10){
                deliveryCharge = 5000;
            }else{
                deliveryCharge = 10000;
            }
        }else if(30000 <= price && price <100000){
            //3~10만원 미만 천원 할인
            deliveryCharge -= 1000;
        }else {
            //10만원 이상 배송비 무료
            deliveryCharge = 0;
        }
        return deliveryCharge;
    }
}
