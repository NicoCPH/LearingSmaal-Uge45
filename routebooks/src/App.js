import logo from './logo.svg';
import './App.css';
import {
  BrowserRouter as Router,
  Switch,
  Route,
  NavLink,
  useLocation
} from "react-router-dom";
const Header = () =>{
  return (
  <ul className="header">
  <li><NavLink exact activeClassName="active" to="/">Home</NavLink></li>
  <li><NavLink activeClassName="active" to="/products">Products</NavLink></li>
  <li><NavLink activeClassName="active" to="/add-book">Add Book</NavLink></li>
  <li><NavLink activeClassName="active" to="/company">Company</NavLink></li>
</ul>
)
}
function App() {
  return (
    <div className="App">
      <div>
  <Header />
  <Switch>
    <Route exact path="/">
      <Home />
    </Route>
    <Route path="/products">
      <Products/>
    </Route>
    <Route path="/company">
      <Company />
    </Route>
    <Route path="*">
    <NotFound/>
    </Route>
  </Switch>
</div>
    </div>
  );
}
function Home() {
  return (
    <div>
      <h2>Home</h2>
    </div>
  );
}

function Company() {
  return (
    <div>
      <h2>products</h2>
    </div>
  );
}

function Products() {
  return (
    <div>
      <h2>products </h2>
    </div>
  );
  }
  function NotFound() {
    let location = useLocation();
  
    return (
      <div>
        <h3>
          No match for <code>{location.pathname}</code>
        </h3>
      </div>
    );
  }
export default App;
