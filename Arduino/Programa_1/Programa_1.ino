/*
  Blink

  Turns an LED on for one second, then off for one second, repeatedly.

  Most Arduinos have an on-board LED you can control. On the UNO, MEGA and ZERO
  it is attached to digital pin 13, on MKR1000 on pin 6. LED_BUILTIN is set to
  the correct LED pin independent of which board is used.
  If you want to know what pin the on-board LED is connected to on your Arduino
  model, check the Technical Specs of your board at:
  https://www.arduino.cc/en/Main/Products

  modified 8 May 2014
  by Scott Fitzgerald
  modified 2 Sep 2016
  by Arturo Guadalupi
  modified 8 Sep 2016
  by Colby Newman

  This example code is in the public domain.

  http://www.arduino.cc/en/Tutorial/Blink
*/
int contador;
int led1;
// the setup function runs once when you press reset or power the board
void setup() {
  // initialize digital pin LED_BUILTIN as an output.
  pinMode(12, OUTPUT);
  pinMode(13, OUTPUT);
  contador = 0;
  led1 = 1;
}

// the loop function runs over and over again forever
void loop() {
  if (contador == 10){
    if (led1 == 1){
      led1=0;
    }else{
      led1=1;
    }
    contador = 0;
  }
  delay(50);
  if (led1==1){
    digitalWrite(13, 1); //Apagamos el led 1
    digitalWrite(12,0);  //Encendemos led 2
  }else{
    digitalWrite(13, 0); //Encendemos LED 1
    digitalWrite(12,1);  //Apagamos LED 2
  }
  delay(50);

  digitalWrite(13, 0); //Apagamos el led 1
  digitalWrite(12,0);  //Encendemos led 2
  
  contador+=1;
}
