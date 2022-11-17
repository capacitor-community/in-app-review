import './App.css';
import { RateApp } from 'capacitor-rate-app';

function App() {
  const handleRequestReview = async () => {
    try {
      await RateApp.requestReview();
      alert('Review request successful');
    } catch (error) {
      console.log(error);
      alert(`Review request failed: ${(error as any)?.message}`);
    }
  };

  return (
    <div className="App">
      <h1>capacitor-rate-app example</h1>
      <div className="card">
        <button onClick={handleRequestReview}>Request review</button>
      </div>
    </div>
  );
}

export default App;
