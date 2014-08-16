; restrictions: comp
(defn my-comp [x & xs]
  (fn [& args]
    ((fn step [[f & fs] a]
       (if fs
         (f (step fs a))
         (apply f a)))
     (cons x xs) args)))

(= [3 2 1] ((my-comp rest reverse) [1 2 3 4]))

(= 5 ((my-comp (partial + 3) second) [1 2 3 4]))

(= true ((my-comp zero? #(mod % 8) +) 3 5 7 9))

(= "HELLO" ((my-comp #(.toUpperCase %) #(apply str %) take) 5 "hello world"))