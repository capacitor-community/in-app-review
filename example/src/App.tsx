
import './App.css'
import { RateApp } from 'capacitor-rate-app';

function App() {

  return (
    <div className="App">
      <h1>capacitor-rate-app example</h1>
      <div className="card">
        <button onClick={() => RateApp.requestReview()}>
          Request review
        </button>
      </div>
    </div>
  )
}

export default App
