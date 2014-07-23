; 100 - Least Common Multiple
(defn lcm [& numbers]
  "Least Common Multiple"
  (letfn [(-gcd [a b] "GCD of two numbers"
                (if (zero? b) a (-gcd b (mod a b))))
          (gcd [& ns] "GCD of many numbers"
               (reduce -gcd ns))]
    (/ (reduce * numbers) (reduce gcd numbers))))


(== (lcm 2 3) 6)

(== (lcm 5 3 7) 105)

(== (lcm 1/3 2/5) 2)

(== (lcm 3/4 1/6) 3/2)

(== (lcm 7 5/7 2 3/5) 210)