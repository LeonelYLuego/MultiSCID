#include <SPI.h>
#include <MFRC522.h>

#define RST_PIN 9
#define SS_PIN 10

MFRC522 rfid(SS_PIN, RST_PIN);

void setup(){
  Serial.begin(9600);
  SPI.begin();
  rfid.PCD_Init();
}

void loop(){
  if(rfid.PICC_IsNewCardPresent()){
    if(rfid.PICC_ReadCardSerial()){
      for(byte i = 0; i < rfid.uid.size; i++){
        if(!i){
          Serial.print(rfid.uid.uidByte[i] < 0x10 ? "0" : "");
          Serial.print(rfid.uid.uidByte[i], HEX);
        }
        else{
          Serial.print(rfid.uid.uidByte[i] << 0x10 ? "0 " : " ");
          Serial.print(rfid.uid.uidByte[i], HEX);
        }
      }
      Serial.println();
      rfid.PICC_HaltA();
      delay(1000);
      Serial.println("Stop");
    }
  }
}

