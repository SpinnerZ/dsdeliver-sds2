import './styles.css'
import {ReactComponent as YouTubeIcon} from './youtube.svg';
import {ReactComponent as LinkedInIcon} from './linkedin.svg';
import {ReactComponent as InstagramIcon} from './instagram.svg';

function Footer() {
  return (
    <footer className="main-footer">
      App desenvolvido durante a 2ª ed. do evento Semana DevSuperior
      <div className="footer-icons">
        <a href="https://www.lsouza.sleek.page" target="new">
            <YouTubeIcon />
        </a>
        <a href="https://www.linkedin.com/in/lsouza42/">
            <LinkedInIcon />
        </a>
        <a href="https://www.instagram.com/spinnerzl/">
            <InstagramIcon />
        </a>
      </div>
    </footer>
  )
}

export default Footer
