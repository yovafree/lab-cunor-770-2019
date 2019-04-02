
int led = 1;
int pin = 13;
int sentido = 1;
void setup() {
  pinMode(13,OUTPUT);
  pinMode(12,OUTPUT);
  pinMode(11,OUTPUT);
  pinMode(10,OUTPUT);
  pinMode(9,INPUT);
}

void loop() {
  int lectura = digitalRead(9);
  if (lectura == 1){
    sentido = 1;  
  }else{
    sentido = -1;
  }
  
  if (led == 1){
      pin = 13;
    if (sentido == -1){
      led=5;
    }
  }else if (led==2){
    pin = 12;
  }else if (led==3){
    pin = 11;
  }else if (led==4){
    pin = 10;
    if (sentido == 1){
      led=0;
    }
  }
  digitalWrite(pin,HIGH);
  delay(100);
  digitalWrite(pin,LOW);
  delay(100);
  led+=sentido;
}
