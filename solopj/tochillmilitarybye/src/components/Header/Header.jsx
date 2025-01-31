import mainImg from "../../assets/tosill-bye.png";
import './Header.css'

export default function Header(){
    return (
      <header>
          <h1>토Chill이의 군바..</h1>
          <img src={mainImg} alt="ByeTosil"/>
      </header>
    );
}